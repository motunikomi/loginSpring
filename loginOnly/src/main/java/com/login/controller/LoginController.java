package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.login.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

  @Autowired
  UserService userService;

  @GetMapping
  public String index(Model model) {
    model.addAttribute("users", userService.findAll());
    return "/index.html";
  }

}
