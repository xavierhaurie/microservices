package com.in28minutes.rest.webseervices.restfull_web_services.versioning;

public class PersonV2 {

    Name name;

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + name +
                '}';
    }

    public PersonV2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }


}
