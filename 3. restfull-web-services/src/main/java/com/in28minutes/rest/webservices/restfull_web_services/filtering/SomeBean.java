package com.in28minutes.rest.webseervices.restfull_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

//@JsonIgnoreProperties({"field1", "field3"})
public class SomeBean {

    @JsonView(View.View1.class)
    private String field1;
//    @JsonIgnore
    @JsonView(View.View2.class)
    private String field2;
    @JsonView({View.View1.class, View.View2.class})
    private String field3;
    private String field4;

    public SomeBean(String field1, String field2, String field3, String field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public String getField4() {
        return field4;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}
