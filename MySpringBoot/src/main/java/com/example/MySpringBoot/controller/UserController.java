package com.example.MySpringBoot.controller;

import com.example.MySpringBoot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    public final UserService userService;

    @GetMapping(value = "/user")
    public String userPage(Model model) {
        model.addAttribute("users",userService.findAll());
        return "userInfo";
    }
}
