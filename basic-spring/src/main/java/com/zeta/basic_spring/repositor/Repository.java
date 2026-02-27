package com.zeta.basic_spring.repositor;

import org.springframework.stereotype.Component;

@Component
public class Repository {
	public void saveOrder(){
		System.out.println("saved");
	}

	public void deleteOrder() {
		System.out.println("deleted");
	}
}
