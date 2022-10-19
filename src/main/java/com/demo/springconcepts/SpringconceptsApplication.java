package com.demo.springconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.components.DemoBean;

@SpringBootApplication
public class SpringconceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concepts Demo");
        ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println("DemoBean = "+ demoBean.toString());
	}

}
