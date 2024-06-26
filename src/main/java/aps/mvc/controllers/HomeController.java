package aps.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("name", "Natan");
        return "test";
    }
}
