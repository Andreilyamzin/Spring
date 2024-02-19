package com.example.Spring1.servise;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {

    private final Set<Integer> items = new HashSet<>();

    public void add(Integer... ids) {
        items.addAll(Arrays.asList(ids));
    }

    public Collection<Integer> getAll() {
        return Collection.unmodifiableSet(items);
    }
}

//