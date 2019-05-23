package controller;

import commons.ServiceResponse;
import dao.TeacherInfoDAO;
import entity.TeacherInfoEntity;
import entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherInfoDAO teacherInfoDAO;

    /**
     * 查询当前登陆的 teacher 信息
     * 可与 /api/user/self 合并一起查询
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/self")
    public ServiceResponse getSelf(HttpSession httpSession) {
        ServiceResponse sr = new ServiceResponse();
        TeacherInfoEntity teacherInfoEntity;
        if (null == httpSession.getAttribute("teacherVo")) {
            UserInfoEntity loginUser = (UserInfoEntity) httpSession.getAttribute("userVo");
            teacherInfoEntity = teacherInfoDAO.getById(loginUser.getTeachWorkId());
            httpSession.setAttribute("teacherVo", teacherInfoEntity);
        } else {
            teacherInfoEntity = (TeacherInfoEntity) httpSession.getAttribute("teacherVo");
        }
        sr.put("vo", teacherInfoEntity);
        return sr;
    }
}
