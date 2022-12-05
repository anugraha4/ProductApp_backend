package com.nest.Productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String ProductAdd(){
        return "product added";
    }

    @PostMapping("/search")
    public String SearchProduct(){
        return "search product";
    }

    @PostMapping("/edit")
    public String EditProduct(){
        return "product edited";
    }

    @GetMapping("/view")
    public String ViewAll(){
        return "View all products";
    }
}
