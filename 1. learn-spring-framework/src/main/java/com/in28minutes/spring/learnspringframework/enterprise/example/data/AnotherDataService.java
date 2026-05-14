package com.in28minutes.spring.learnspringframework.enterprise.example.data;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnotherDataService {

    public List<Integer> getData() {
        return List.of(1,2,3,4);
    }
}
