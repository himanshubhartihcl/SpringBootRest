package com.vin.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String sayHi() {
		return "Hi";
	}

}
