package com.in28minutes.rest.webseervices.restfull_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonSbiController {

//    @GetMapping(value = "/{version}/personsbi", version = "1")
//    public PersonV1 getFirstVersionOfPersonsbi() {
//        return new PersonV1("Bob Charlie");
//    }
//
//    @GetMapping(value = "/{version}/personsbi", version = "2")
//    public PersonV2 getSecondVersionOfPersonsbi() {
//        return new PersonV2(new Name("Bob", "Charlie"));
//    }

    @GetMapping(path="/personsbi", params="version=1")
    public PersonV1 getFirstVersionOfPersonRequestParams() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/personsbi", params="version=2")
    public PersonV2 getSecondVersionOfPersonRequestParams() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(path="/personsbi/header", headers="X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/personsbi/header", headers="X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(path="/personsbi/accept", produces="application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/personsbi/accept", produces="application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @Override
    public String toString() {
        return "VersioningPersonController{}";
    }
}
