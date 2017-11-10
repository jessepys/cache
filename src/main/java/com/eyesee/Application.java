package com.eyesee;

import com.eyesee.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        HelloService helloService = ctx.getBean(HelloService.class);
        String message = helloService.sayHello("hello");
        LOG.info("say hello: {}", message);
        message = helloService.sayHello("hello");
        LOG.info("say hello: {}", message);
        message = helloService.sayHello("hello");
        LOG.info("say hello: {}", message);
    }
}
