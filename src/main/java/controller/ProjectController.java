package controller;

import commons.ServiceResponse;
import dao.ProjectInfoDAO;
import entity.ProjectInfoEntity;
import entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/project")
public class ProjectController {

    // 失败状态
    private Boolean STATUS_FALSE = false;
    // 成功状态
    private Boolean STATUS_SUCCEED = true;

    @Autowired
    private ProjectInfoDAO projectInfoDAO;

    @ResponseBody
    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public ServiceResponse apply(ProjectInfoEntity entity, HttpSession httpSession) {
        ServiceResponse sr = new ServiceResponse();
        UserInfoEntity loginUser = (UserInfoEntity) httpSession.getAttribute("userVo");
        entity.setAddTime(new Date());
        entity.setAddTeachId(loginUser.getTeachId());
        projectInfoDAO.add(entity);
        return sr;
    }

    @ResponseBody
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public ServiceResponse check(ProjectInfoEntity entity, HttpSession httpSession) {
        ServiceResponse sr = new ServiceResponse();
        if (null == entity.getProjectId()) {
            sr.put("errorMsg", "请指定审核的项目");
            return sr;
        }
        UserInfoEntity loginUser = (UserInfoEntity) httpSession.getAttribute("userVo");
        entity.setReviewerId(loginUser.getTeachId());
        entity.setReviewerName(loginUser.getName());
        entity.setReviewTime(new Date());
        projectInfoDAO.update(entity);
        return sr;
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ServiceResponse list(Integer pageNo,
                                @RequestParam Integer pageSize) {
        ServiceResponse sr = new ServiceResponse();
        sr.put("vos", projectInfoDAO.list(pageNo, pageSize, "from entity.ProjectInfoEntity"));
        return sr;
    }
}
