package controller;

import commons.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse addNewUser() {
        ServiceResponse sr = new ServiceResponse();

        return sr;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse updateUser() {
        ServiceResponse sr = new ServiceResponse();

        return sr;
    }

    @RequestMapping(value = "/delete")
    public ServiceResponse deleteUser(@RequestParam Long userId) {
        ServiceResponse sr = new ServiceResponse();

        return sr;
    }

    @RequestMapping(value = "/list")
    public ServiceResponse list() {
        ServiceResponse sr = new ServiceResponse();

        return sr;
    }
}
