package com.adi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by adithya on 2/11/17.
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {

        return "redirect:/pages/final.html";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {

        return "final";
    }
}
