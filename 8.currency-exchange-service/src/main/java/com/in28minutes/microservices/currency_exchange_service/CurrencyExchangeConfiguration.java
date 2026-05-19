package com.in28minutes.microservices.currency_exchange_service;

import io.micrometer.observation.ObservationRegistry;
import org.springframework.boot.restclient.RestClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyExchangeConfiguration {

    // to enable tracing across the microservices
    @Bean
    public RestClientCustomizer restClientCustomizer(ObservationRegistry registry) {
        return builder -> builder.observationRegistry(registry);
    }

}
