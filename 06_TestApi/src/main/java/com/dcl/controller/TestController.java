package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.Service.FeiginService;

@RestController
public class TestController {

	@Autowired
	private FeiginService fservice;
	
	@GetMapping("/test")
	public String test() {
		return "welcome to the world of microservices"+fservice.getMessage();
	}
}
