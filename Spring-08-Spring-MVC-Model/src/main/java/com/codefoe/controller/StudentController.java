package com.codefoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model,Random random){
        model.addAttribute("name","Codefoe");
        model.addAttribute("course", "MVC");
        String subject= "Collections";
        model.addAttribute("subject",subject);
        int id = random.nextInt(0,10000);
        model.addAttribute("id",id);

        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i< 10; i++) {
            numbers.add(random.nextInt(0,10000));
        }
        model.addAttribute("numbers", numbers);


        return "/student/welcome";
    }
}
