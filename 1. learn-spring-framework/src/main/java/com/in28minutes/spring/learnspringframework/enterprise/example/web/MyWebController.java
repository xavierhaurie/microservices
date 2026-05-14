package com.in28minutes.spring.learnspringframework.enterprise.example.web;

import com.in28minutes.spring.learnspringframework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    BusinessService businessService;

    @Autowired
    public MyWebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public int returnValueFromBusinessService() {
        // call the business service
        return businessService.calculateSum();
    }
}
