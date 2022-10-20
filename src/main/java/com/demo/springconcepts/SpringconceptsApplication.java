package com.demo.springconcepts;

import com.demo.springconcepts.components.DemoBean;
import com.demo.springconcepts.components.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconceptsApplication {

    public static final Logger logger = LoggerFactory.getLogger(SpringconceptsApplication.class);

    public static void main(String[] args) {
        logger.info("Welcome to Spring Concepts Demo");
        ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);

        logger.debug("DemoBean = "+ demoBean.toString());
        
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(101);
        employeeBean.setEname("Spring Framework Guru");
        employeeBean.showEmployeeDetails();
    }

}

