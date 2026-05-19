package com.in28minutes.microservice.currency_conversion_service;

import io.micrometer.observation.ObservationRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.restclient.RestClientCustomizer;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CurrencyConversionConfiguration {

    // to enable tracing across the microservices
    @Bean
    public RestClientCustomizer restClientCustomizer(ObservationRegistry registry) {
        return builder -> builder.observationRegistry(registry);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
