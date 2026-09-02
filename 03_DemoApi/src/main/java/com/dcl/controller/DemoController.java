package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private Environment env;
	
	@Value("${message}")
	private String message;
	
	
	@GetMapping("/demo")
	public String demo() {
		String port=env.getProperty("server.port");
		
		return message+".server-port"+port;
	}
}
