package controller;

import commons.ServiceResponse;
import dao.TeacherInfoDAO;
import dao.UserInfoDAO;
import entity.TeacherInfoEntity;
import entity.UserInfoEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import param.TeacherParam;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserInfoDAO userInfoDAO;
    @Autowired
    private TeacherInfoDAO teacherInfoDAO;

    /**
     * 用户登陆
     * @param username
     * @param password
     * @param httpSession
     * @return
     */
    @RequestMapping("login")
    public String doLogin(String username , String password, HttpSession httpSession) {
        UserInfoEntity entity = userInfoDAO.doLogin(username, password);
        if (entity  != null) {
            httpSession.setAttribute("userVo", entity);
        }
        return "index";
    }

    /**
     * 添加用户
     * 需要同时添加教师信息
     * @param teacherParam
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse addNewUser(TeacherParam teacherParam) {
        ServiceResponse sr = new ServiceResponse();
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        BeanUtils.copyProperties(teacherParam, userInfoEntity);
        userInfoDAO.add(userInfoEntity);

        TeacherInfoEntity teacherInfoEntity = new TeacherInfoEntity();
        BeanUtils.copyProperties(teacherParam, teacherInfoEntity);
        teacherInfoDAO.add(teacherInfoEntity);
        return sr;
    }

    /**
     * 更新用户操作，不管是修改密码还是更新teacher信息都是这个接口
     * 懒得开其他的接口了
     * @param teacherParam
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse updateUser(TeacherParam teacherParam, HttpSession httpSession) {
        ServiceResponse sr = new ServiceResponse();
        // 如果更新的是当前登陆用户，将更新内容更新到session
        UserInfoEntity loginUser = (UserInfoEntity) httpSession.getAttribute("userVo");
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        BeanUtils.copyProperties(teacherParam, userInfoEntity);

        TeacherInfoEntity teacherInfoEntity = new TeacherInfoEntity();
        BeanUtils.copyProperties(teacherParam, teacherInfoEntity);
        if (loginUser.getTeachId().equals(teacherParam.getTeachId())) {
            httpSession.setAttribute("userVo", userInfoEntity);
            httpSession.setAttribute("teacherVo", teacherInfoEntity);
        }
        userInfoDAO.update(userInfoEntity);
        teacherInfoDAO.update(teacherInfoEntity);
        return sr;
    }

    @RequestMapping(value = "/delete")
    public ServiceResponse deleteUser(@RequestParam Integer teachId) {
        ServiceResponse sr = new ServiceResponse();
        UserInfoEntity entity = new UserInfoEntity();
        entity.setTeachId(teachId);
        userInfoDAO.delete(entity);
        return sr;
    }

    /**
     * 这是获取当前登陆用户的信息，主要是查询账号密码
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/self")
    public ServiceResponse getSelf(HttpSession httpSession) {
        ServiceResponse sr = new ServiceResponse();
        UserInfoEntity loginUser = (UserInfoEntity) httpSession.getAttribute("userVo");
        sr.put("vo", loginUser);
        return sr;
    }
}
