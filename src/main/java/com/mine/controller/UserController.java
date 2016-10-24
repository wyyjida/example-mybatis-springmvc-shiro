package com.mine.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mine.entity.User;
import com.mine.service.UserService;
import com.mine.service.UserServiceImpl;
import com.mine.util.SpringUtils;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.io.IOException;

/**
 * Created by Acting on 2016/10/17.
 */

@Controller("userController")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/person", method=RequestMethod.POST)
    public User getUser(@RequestBody Integer id) {
        ObjectMapper mapper = new ObjectMapper();
        User user = userService.findOneById(id);
        System.out.println(user);
//        User user = userService.selectByPrimaryKey(id);

        return user;
    }

}
