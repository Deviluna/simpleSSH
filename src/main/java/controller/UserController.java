package controller;

import commons.ServiceResponse;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String doLogin(String username , String password, HttpSession httpSession){
        if(userService.doLogin(username,password)){
            httpSession.setAttribute("username",username);

        }
        return "index";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse addNewUser(UserEntity userEntity) {
        ServiceResponse sr = new ServiceResponse();
        userService.addUser(userEntity);
        return sr;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse updateUser(UserEntity userEntity) {
        ServiceResponse sr = new ServiceResponse();
        userService.updateUser(userEntity);
        return sr;
    }

    @RequestMapping(value = "/delete")
    public ServiceResponse deleteUser(@RequestParam Integer userId) {
        ServiceResponse sr = new ServiceResponse();
        userService.deleteUser(userId);
        return sr;
    }

    @RequestMapping(value = "/list")
    public ServiceResponse list(@RequestParam(required = false, defaultValue = "1")Integer pageNo,
                                @RequestParam(required = false, defaultValue = "10")Integer pageSize,
                                @RequestParam(required = false) String username,
                                @RequestParam(required = false) Boolean type) {
        ServiceResponse sr =  userService.listUsers(pageNo, pageSize, username, type);
        return sr;
    }
}
