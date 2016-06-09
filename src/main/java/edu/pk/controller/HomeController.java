package edu.pk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class HomeController {
    @RequestMapping(value = "/onLoad", method = RequestMethod.GET)
    public String loadPage(ModelMap model) {
        LoginUser loginUser = new LoginUser();
        loginUser.setUserId("ID001");
        loginUser.setEmail("jena@p.com");
        loginUser.setSex('M');
        model.addAttribute(loginUser);

        model.addAttribute("countryList", Arrays.asList("India","China","Bangladesh","Sri Lanka"));
        return "home";
    }

}
