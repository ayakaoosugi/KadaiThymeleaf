package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutputController {

    @GetMapping("/output")
    public String getLink(Model model) {
        model.addAttribute("id", "' + ${val} + '");
        return "output";}}
