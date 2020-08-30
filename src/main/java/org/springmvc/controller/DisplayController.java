package org.springmvc.controller;

import org.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        ModelAndView mav = new ModelAndView("display");
        mav.addObject("name", String.class);
        return mav;
    }

    @RequestMapping(value = "/displayName", method = RequestMethod.POST)
    public ModelAndView loginProcess(String name) {
        ModelAndView mav = null;
        mav = new ModelAndView("welcome");
        mav.addObject("name", name);
        return mav;
    }
}
