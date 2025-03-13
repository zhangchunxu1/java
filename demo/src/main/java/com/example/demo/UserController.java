package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserInterface userInterface;

    @GetMapping("/user")
    public String getUser(@RequestParam String userId, @RequestParam String additionalInfo) {
        return userInterface.getUserInfo(userId, additionalInfo);
    }
}