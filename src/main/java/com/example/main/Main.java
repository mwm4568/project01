package com.example.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}

 