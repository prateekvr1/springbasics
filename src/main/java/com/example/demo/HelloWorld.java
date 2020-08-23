package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorld {
  public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(HelloWorld.class, args);
        CustomerDetails c=context.getBean(CustomerDetails.class);
        c.dispaly();
        System.out.println("Hello World");
    }

}
