package com.book.app.book_store_spring_boot.controller;

import org.springframework.ui.Model;
import com.book.app.book_store_spring_boot.entity.User;
import com.book.app.book_store_spring_boot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {
    @Autowired
userService service;

    @GetMapping("/registeration")
    public String register(){
        return "registeration";
    }
    @PostMapping("/userRegister")
    public String saveUser(@ModelAttribute User user){
        service.registerUser(user);
        return "redirect:login";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        User user = service.findBuyUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return "redirect:adminHomePage";
        } else {
            model.addAttribute("error", "Invalid username or password");

            return "login";
        }
    }
}
