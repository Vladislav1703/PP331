package com.example.spring231.controllers;

import com.example.spring231.models.User;
import com.example.spring231.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path="/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String allUsers(ModelMap map) {
        List<User> userList = userService.getUsers();
        map.addAttribute("users", userList);
        return "index";
    }
}
