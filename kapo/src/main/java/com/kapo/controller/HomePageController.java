package com.kapo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	@GetMapping(value="hello")
	public String getMessage() {
		return "Hello";
	}

}
