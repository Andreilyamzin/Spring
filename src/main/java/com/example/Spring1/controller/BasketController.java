package com.example.Spring1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")

public class BasketController {
    private final BasketController servise;

    public BasketController(BasketController servise) {
        this.servise = servise;
    }

    @GetMapping("/add")
    public void add(@RequestParam Integer[] ids){
        servise.add(ids);
    }

 @GetMapping("/get")
    public Collection<Integer> get() {
return servise.getAll();
 }


}