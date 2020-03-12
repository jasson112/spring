package com.example.demo02.controller;

import com.example.demo02.model.Registration;
import com.example.demo02.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(
            @RequestParam(value = "firstname", defaultValue = "Jhon") String firstname,
            @RequestParam(value = "lastname", defaultValue = "Doe") String lastname,
            @RequestParam(value = "age", defaultValue = "34") int age
    ){

        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }
}
