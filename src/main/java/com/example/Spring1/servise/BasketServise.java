package com.example.Spring1.servise;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BasketServise {
    private final Basket basket;

    public BasketServise(Basket basket) {
        this.basket = basket;
    }

    public void add(Integer... ids){
        basket.add(ids);
    }
    public Collection<Integer> getAll() {
        return basket.getAll();
    }
}
