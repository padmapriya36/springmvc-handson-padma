package org.springmvc.controller;

import org.springmvc.model.User;
import org.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProfileController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView showRegister() {
        ModelAndView mav = new ModelAndView("profile");
        mav.addObject("profile", new User());
        return mav;
    }

    @RequestMapping(value = "/profileDisplay", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user) {
        userService.register(user);
        ModelAndView mav = new ModelAndView("profile");
        mav.addObject("username", user.getUsername());
        mav.addObject("firstName", user.getFirstName());
        mav.addObject("lastName", user.getLastName());
        mav.addObject("age", user.getAge());
        return mav;
    }
}
