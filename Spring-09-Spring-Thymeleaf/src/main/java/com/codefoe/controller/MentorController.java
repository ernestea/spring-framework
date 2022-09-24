package com.codefoe.controller;

import com.codefoe.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("mentor")
public class MentorController {

    @GetMapping("/create")
    public String createMentor(Model model) {
        model.addAttribute("mentor", new Mentor());

        model.addAttribute("batchList",List.of("JD1", "JD2", "EU1", "EU2"));
        return "mentor/mentor-register";
    }
}
