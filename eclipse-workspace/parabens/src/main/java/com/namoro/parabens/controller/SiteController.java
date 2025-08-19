package com.namoro.parabens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("nome", "Meu Amor");
        model.addAttribute("anos", 12);
        return "index"; // vai procurar o arquivo index.html em /templates
    }
}
