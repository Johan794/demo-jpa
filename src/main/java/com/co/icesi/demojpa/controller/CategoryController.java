package com.co.icesi.demojpa.controller;

import com.co.icesi.demojpa.repository.CategoryRespository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    private final CategoryRespository categoryRespository;

    public CategoryController(CategoryRespository categoryRespository){
        this.categoryRespository = categoryRespository;
    }
}
