package com.zeta.basic_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zeta.basic_spring.entity.Service;
import com.zeta.basic_spring.repositor.Repository;

@SpringBootApplication
public class BasicSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicSpringApplication.class, args);
		Service service = context.getBean(Service.class);
		Repository repository = context.getBean(Repository.class);
		System.out.println(repository);
		service.addOrder();
//		Service service1 = context.getBean(Service.class);
//		Service notBean = new Service();
//		System.out.println(service == service1);
	}

}
