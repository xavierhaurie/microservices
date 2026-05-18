package com.in28minutes.microservices.currency_exchange_service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
