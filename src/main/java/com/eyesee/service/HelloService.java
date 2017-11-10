package com.eyesee.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    private static final Logger LOG = LoggerFactory.getLogger(HelloService.class);

    @Cacheable("hello")
    public String sayHello(String key) {
        LOG.info("enter hello service");
        return "hello in service";
    }
}
