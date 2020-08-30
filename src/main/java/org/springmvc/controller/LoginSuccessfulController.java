package org.springmvc.controller;

import org.springmvc.model.BookInfo;
import org.springmvc.model.User;
import org.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginSuccessfulController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/loginSuccessful", method = RequestMethod.GET)
    public ModelAndView showRegister() {
        ModelAndView mav = new ModelAndView("loginSuccessful");
        mav.addObject("profile", new User());
        return mav;
    }

    @RequestMapping(value = "/getProfile", method = RequestMethod.GET)
    public ModelAndView getUser(@RequestParam String username) {
        final User user = userService.getUser(username);
        ModelAndView mav = new ModelAndView("profile");
        mav.addObject("username", user.getUsername());
        mav.addObject("firstName", user.getFirstName());
        mav.addObject("lastName", user.getLastName());
        mav.addObject("age", user.getAge());
        return mav;
    }

    @RequestMapping(value = "/bookInfo", method = RequestMethod.POST)
    public ModelAndView retrieveBookInfo(@RequestParam String username) {
        ModelAndView mav = new ModelAndView("bookinfo");
        final BookInfo bookInfo = new BookInfo();
        bookInfo.setUsername(username);
        mav.addObject("bookInfo", bookInfo);
        return mav;
    }
}
