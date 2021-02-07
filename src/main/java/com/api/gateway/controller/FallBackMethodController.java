package com.api.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@RequestMapping(value="departmentServiceFallBack", method = {RequestMethod.GET,RequestMethod.POST})
	public String departmentServiceFallBack() {
		return "Department Service is taking longer time."
				+" Please try again Later.";
	}
	
	@RequestMapping(value="userServiceFallBack", method = {RequestMethod.GET,RequestMethod.POST})
	public String userServiceFallBack() {
		return "User Service is taking longer time."
				+" Please try again Later.";
	}
}
