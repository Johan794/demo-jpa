package com.co.icesi.demojpa.controller;

import com.co.icesi.demojpa.repository.IcesiRolRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IcesiRoleController {
    private final  IcesiRolRepository repository;

    public IcesiRoleController (IcesiRolRepository repository){
        this.repository = repository;
    }
}
