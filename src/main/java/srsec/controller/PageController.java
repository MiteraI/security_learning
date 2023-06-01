package srsec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @GetMapping("/login")
    public String loginPage() {
        System.out.println("Logging in again");
        return "login";
    }
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

}
