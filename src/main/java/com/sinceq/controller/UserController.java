package com.sinceq.controller;

import com.sinceq.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by monster on 9/2/14.
 */

@Controller
@RequestMapping("/user/")
public class UserController {

    @RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable Integer user_id) throws Exception{
        User user = new User();
        user.setId(user_id);
        user.setName("sinceq");
        return user;
    }
}