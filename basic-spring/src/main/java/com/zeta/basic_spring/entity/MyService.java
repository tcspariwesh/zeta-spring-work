package com.zeta.basic_spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zeta.basic_spring.repositor.MyRepository;

//@Scope("prototype")
//@Component
@Service
public class MyService {
	@Autowired
	MyRepository repository;// dependency

	public void addOrder() {
		// BL
		repository.saveOrder();
		System.out.println("saved");
	}

	public void deleteOrder() {
		// BL
		repository.deleteOrder();
		System.out.println("saved");
	}
}
