package com.in28minutes.microservices.currency_exchange_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ExchangeServiceController {

    private Logger logger =
            LoggerFactory.getLogger(CircuitBreakerController.class);

    @Autowired
    CurrencyExchangeRepository repository;

    @Autowired
    Environment environment;

    @GetMapping(path="/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to) {

        logger.info("getCurrencyExchange called with {} to {}", from, to);
//        34960 --- [currency-exchange] [nio-8000-exec-1] [ae69edb112a9adbd8bd9a8209c4db13a-c145ad756385c74e] c.i.m.c.CircuitBreakerController         : getCurrencyExchange called with USD to INR
//      micrometer assigns an ID to the request, and that ID is used in the logs to correlate all the logs for that request.
//      in this case the id is ae69edb112a9adbd8bd9a8209c4db13a-c145ad756385c74e

        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
        if (currencyExchange == null) {
            throw new RuntimeException("No currency exchange between " + from + " and " + to);
        }
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
