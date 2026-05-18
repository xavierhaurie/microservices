package com.in28minutes.microservices.currency_exchange_service;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private Logger logger =
            LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("sample-api")
//    @Retry(name="sample-api", fallbackMethod="hardcodedResponse")
    // go to Spring Boot 2 documentation to see all the options: https://resilience4j.readme.io/docs/getting-started-3
//    @CircuitBreaker(name="default", fallbackMethod="hardcodedResponse")
//    @RateLimiter(name="default")
    @Bulkhead(name="default")
    String sampleApi() {

        logger.info("sample-api call received");

//        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-bogus-URI", String.class);
//        return forEntity.getBody();

        return "sample-api, rate-limited by resilience4j";

    }

    // can have distinct hardcodedResponse signatures for different kinds of errors
    public String hardcodedResponse(Exception ex) {
        return "fallback response for Exception";
    }

}
