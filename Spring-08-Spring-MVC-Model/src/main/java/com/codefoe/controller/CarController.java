package com.codefoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")//localhost:8088/car/info?make=Honda
    public String carInfo
            (
            @RequestParam(required = false,defaultValue = "Tesla") String make,
            @RequestParam(required = false,defaultValue = "Model 3") String carModel,
            @RequestParam(required = false,defaultValue = "2020") String year,
            Model model
            )
    {
        model.addAttribute("make",make);
        model.addAttribute("carModel",carModel);
        model.addAttribute("year",year);
        return "car/car-info";
    }
}
