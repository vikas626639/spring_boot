package com.nit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proj01WishAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj01WishAppApplication.class, args);
		WishApp bean = run.getBean(WishApp.class);
		String wishMsg = bean.WishMsg("vikas", new Date());
		System.out.println(wishMsg);
	}
}
