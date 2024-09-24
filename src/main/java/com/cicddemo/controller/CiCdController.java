package com.cicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome All";
	}
}
