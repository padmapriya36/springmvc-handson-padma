package org.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springmvc.model.User;
import org.springmvc.service.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    public UserService userService;

    @RequestMapping( value = "/register", method = RequestMethod.GET )
    public ModelAndView showRegister( ) {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping( value = "/registerProcess", method = RequestMethod.POST )
    public ModelAndView addUser( @Valid User user, BindingResult result ) {
        ModelAndView mav;
        if (result.hasErrors()) {
            return new ModelAndView("register");
        }
        User existingUser = userService.getUser(user.getUsername());
        if (existingUser != null) {
            mav = new ModelAndView("register");
            mav.addObject("message", "username already exists");
            return mav;
        }
        mav = new ModelAndView("registrationSuccess");
        userService.register(user);
        mav.addObject("firstName", user.getFirstName());
        mav.addObject("lastName", user.getLastName());
        mav.addObject("age", user.getAge());


        return mav;
    }
}
