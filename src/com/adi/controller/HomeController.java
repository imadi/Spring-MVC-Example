package com.adi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adithya on 2/11/17.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("name", "Vamsi");
        return "test";
    }
}
