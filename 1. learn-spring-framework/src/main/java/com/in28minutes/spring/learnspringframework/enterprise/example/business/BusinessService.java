package com.in28minutes.spring.learnspringframework.enterprise.example.business;

import com.in28minutes.spring.learnspringframework.enterprise.example.data.AnotherDataService;
import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    @Autowired
    DataService dataService;
    @Autowired
    AnotherDataService anotherDataService;

//    public BusinessService(DataService dataService, AnotherDataService anotherDataService) {
//        this.dataService = dataService;
//        this.anotherDataService = anotherDataService;
//    }

    public int calculateSum() {
        // call the data service
        int sum1 = dataService.getData().stream().reduce(Integer::sum).get();
        int sum2 = anotherDataService.getData().stream().reduce(Integer::sum).get();
        return sum1 + sum2;
    }
}
