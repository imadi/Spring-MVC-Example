package com.adi.controller;

import com.adi.domain.Student;
import com.adi.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by adithya on 2/11/17.
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String student(Model model) {
        // return new ModelAndView("student", "command", new Student());
        model.addAttribute("command", new Student());
        return "student";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    @ExceptionHandler({CustomException.class})
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {

        if (student.getName().length() < 5) {
            throw new CustomException("Name is too short");
        } else {
            model.addAttribute("name", student.getName());
        }
        if (student.getAge() < 10) {
            throw new CustomException("Age is too low");
        } else {
            model.addAttribute("age", student.getAge());
        }
        model.addAttribute("name", student.getName());
        model.addAttribute("id", student.getId());
        return "result";
    }
}
