package com.rahulografy.springdemo.currencyexchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahulografy.springdemo.currencyexchange.controllers.bean.ExchangeValue;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByFromAndTo(String from, String to);
}