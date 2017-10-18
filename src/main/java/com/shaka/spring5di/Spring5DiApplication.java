package com.shaka.spring5di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5DiApplication {

    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(Spring5DiApplication.class, args);
        Greeter greeter = context.getBean(Greeter.class);
        System.out.println(greeter.greet());
    }
}
