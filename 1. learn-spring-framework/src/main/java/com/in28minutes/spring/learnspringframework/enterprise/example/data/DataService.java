package com.in28minutes.spring.learnspringframework.enterprise.example.data;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataService {

    public List<Integer> getData() {
        // same thing?
//        return Arrays.asList(10,20,30,40);
        return List.of(10,20,30,40);
    }
}
