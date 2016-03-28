package com.jsonqiao.redis.controller;

import com.jsonqiao.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsonqiao on 2016-03-28.
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getById")
    public Object getById(@RequestParam(value = "id", defaultValue = "0000") String id) {
        return userService.getById(id);
    }
}
