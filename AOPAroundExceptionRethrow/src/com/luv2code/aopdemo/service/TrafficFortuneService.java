package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {


	public String getFortune(boolean tripWire) {

		if (tripWire) {
			throw new RuntimeException("Major accident! Highway is closed!");
		}
		
		return "No Exception";
	}
}
