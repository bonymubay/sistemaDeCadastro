package com.api.apiBony.controller;

import com.api.apiBony.moodel.User;
import com.api.apiBony.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void adicionar(@RequestBody User user){
        userService.adicionarUser(user);
    }

    @GetMapping("/view")
    public List<User> verUsers(){
        return userService.listar();
    }
}
