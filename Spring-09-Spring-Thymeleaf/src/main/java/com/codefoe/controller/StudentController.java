package com.codefoe.controller;

import com.codefoe.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

    @GetMapping("/welcome")
    public String info(Model model) {
        return "student/welcome";
    }


}
