package com.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String homepage() {
		return "index";
	}
	@GetMapping("/test")
	public String test() {
		return "destination-cities";
	}

}
