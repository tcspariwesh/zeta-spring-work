package com.zeta.basic_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicSpringApplication.class, args);//spring container
//		MyService service = context.getBean(MyService.class);
//		MyRepository repository = context.getBean(MyRepository.class);
//		System.out.println(repository);
//		service.addOrder();
//		Service service1 = context.getBean(Service.class);
//		Service notBean = new Service();
//		System.out.println(service == service1);
	}

}
