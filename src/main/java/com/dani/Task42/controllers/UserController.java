package com.dani.Task42.controllers;

import com.dani.Task42.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    static List<User> usersList = new ArrayList<>();

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return usersList;
    }

    @GetMapping("/users/{id}")
    public void getEspecificUser(@PathVariable UUID id){

    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        UUID randomId = UUID.randomUUID();
        String nameUser = user.getName();
        String emailUser = user.getEmail();
        User user1 = new User(randomId, nameUser, emailUser);

        usersList.add(user1);
        return user1;
    }

}
