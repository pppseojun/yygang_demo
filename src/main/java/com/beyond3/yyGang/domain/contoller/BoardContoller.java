package com.beyond3.yyGang.domain.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardContoller {
    @GetMapping("/")
    public String home() {
        return "/index";
    }
}