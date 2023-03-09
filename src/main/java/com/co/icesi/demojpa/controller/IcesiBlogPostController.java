package com.co.icesi.demojpa.controller;


import com.co.icesi.demojpa.repository.IcesiBlogPostRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IcesiBlogPostController {
    private final IcesiBlogPostRepository repository;

    public  IcesiBlogPostController(IcesiBlogPostRepository repository){
        this.repository = repository;
    }
}
