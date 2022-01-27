package com.example.lostandfound.controller;

import com.example.lostandfound.database.entity.Person;
import com.example.lostandfound.service.IUserService;
import com.example.lostandfound.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResultBean<Person> register(@RequestBody Person p){
        return userService.register(p);
    }

}
