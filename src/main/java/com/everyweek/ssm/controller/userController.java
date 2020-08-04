package com.everyweek.ssm.controller;


import com.everyweek.ssm.entrty.User;
import com.everyweek.ssm.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    userService userService;

    @RequestMapping("/getUserByUserId")
    public User getUserByUserId(@RequestParam("userId") String userId){
       return userService.getUserByUserId(userId);
    }
}
