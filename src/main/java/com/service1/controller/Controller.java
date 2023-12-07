package com.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	@GetMapping("/")
	public String hello() {
		return "This is home page";
	}

	@GetMapping("/name")
	public String helloName(@RequestParam String name) {
		return "This is ur name : " + name;
	}
}
