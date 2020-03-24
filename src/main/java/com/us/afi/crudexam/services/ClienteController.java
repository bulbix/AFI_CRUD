package com.us.afi.crudexam.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afi")
public class ClienteController {
	
	
	@GetMapping("hello")
	public String sayHello() {
		return "hello";
	}
	

}
