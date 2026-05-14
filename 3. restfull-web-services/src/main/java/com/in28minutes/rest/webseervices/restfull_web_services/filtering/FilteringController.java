package com.in28minutes.rest.webseervices.restfull_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filtering() {
        return new SomeBean("value1", "value2", "value3", "value4");
    }

    @GetMapping("/filtering-list")
    List<SomeBean> filteringList() {
        return List.of(new SomeBean("value1", "value2", "value3", "value4"),
                new SomeBean("value5", "value6", "value7", "value8"));}

    @GetMapping("/filtering-with-view")
    @JsonView(View.View1.class)
    public SomeBean filteringWithView() {
        return new SomeBean("value1", "value2", "value3", "value4");
    }

    @GetMapping("/filtering-list-with-view")
    @JsonView(View.View2.class)
    List<SomeBean> filteringListWithView() {
        return List.of(new SomeBean("value1", "value2", "value3", "value4"),
                new SomeBean("value5", "value6", "value7", "value8"));}
}
