package com.zeta.basic_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.basic_spring.entity.OrderRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
	@PostMapping
	OrderRequest addOrder(@RequestBody OrderRequest order) {
		System.out.println(order);
		return order;
	}
	@GetMapping("/{id}")
	String getOrder(@PathVariable String id) {
		System.out.println(id);
		return "success";
	}
	@GetMapping
	String getOrder1() {
		return "get all orders";
	}
	
	
}
