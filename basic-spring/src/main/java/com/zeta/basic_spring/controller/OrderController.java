package com.zeta.basic_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@GetMapping("/order/{id}")
	String getOrder(@PathVariable String id) {
		System.out.println(id);
		return "success";
	}
	@GetMapping("/order")
	String getOrder1() {
		return "get all orders";
	}
	
	
}
