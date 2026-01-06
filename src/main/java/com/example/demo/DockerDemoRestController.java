package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoRestController {

	
	@GetMapping("/deckerDemo")
	public String demo() {
		return "Spring boot application is Dockerized successfully";
	}
}
