package com.splitwise.controllers;

import com.splitwise.dtos.CreateUserDto;
import com.splitwise.dtos.GetUserDto;
import com.splitwise.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {

    UserService service;

    @PostMapping("/user")
    public GetUserDto createUser(@RequestBody CreateUserDto request) {
        //1.Validate the request
        validate(request);

        System.out.println("User request: " + request.getName());

        //2. Data transformation;
        return service.createUser(request).dto();
    }

    @GetMapping("/user/{id}")
    public GetUserDto  getUser(@PathVariable Long id){
        return service.getUser(id).dto();
    }
    private static void validate(CreateUserDto request) {
        if (request.getName() == null) {
            throw new RuntimeException("Name is not present");
        }
        if (request.getPassword() == null) {
            throw new RuntimeException("Password is not present");
        }
    }

}
