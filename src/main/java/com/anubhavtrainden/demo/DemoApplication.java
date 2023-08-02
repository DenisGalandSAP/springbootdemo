package com.anubhavtrainden.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anubhavtrainden.demo.classes.Laptop;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
		Laptop lenovo = context.getBean(Laptop.class);
		lenovo.setBrandName("lenovo");
		lenovo.setLength(3);
		lenovo.setWidth(3);
		lenovo.setWeight(3);
		System.out.println(lenovo.toString());
	}

}
