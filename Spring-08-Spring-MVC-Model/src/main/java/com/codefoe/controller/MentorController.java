package com.codefoe.controller;

import com.codefoe.enums.Gender;
import com.codefoe.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String mentor(Model model) {
        Mentor mentor = new Mentor("Ernest", "Kozhokmatov", 35, Gender.MALE);
        Mentor mentor1 = new Mentor("Erkin", "Uza", 36, Gender.MALE);
        Mentor mentor2 = new Mentor("Sabyr", "Nazar", 36, Gender.MALE);
        Mentor mentor3 = new Mentor("Adilet", "Bekm", 36, Gender.MALE);
        List<Mentor> mentors = List.of(mentor,mentor1,mentor2,mentor3);
        model.addAttribute("mentors",mentors);
        return "mentor/list";
    }
}
