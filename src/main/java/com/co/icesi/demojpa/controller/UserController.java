package com.co.icesi.demojpa.controller;

import com.co.icesi.demojpa.dto.UserCreateDTO;
import com.co.icesi.demojpa.model.IcesiUser;
import com.co.icesi.demojpa.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/user")
    public IcesiUser createIcesiUser(@RequestBody UserCreateDTO user){
        return  service.save(user);
    }

    @GetMapping("users/{id}")
    public IcesiUser getIcesiUser(@PathVariable("id")UUID id){
        return  service.findById(id).orElseThrow();
    }

}
