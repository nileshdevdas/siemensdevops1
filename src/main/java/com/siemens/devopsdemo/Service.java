package com.siemens.devopsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String test() {
		System.out.println("Request Received....");
		return "thank you";
	}
}
