package com.bitesquared.dev.controllers;
import com.bitesquared.dev.models.User;
import com.bitesquared.dev.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    // Just a register method for post.
    @PostMapping("/register")
    @ResponseBody
    public User register(@RequestParam String username, @RequestParam String password, @RequestParam int id){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setId(id);
        userRepository.save(user);
        return user;
    }
}
