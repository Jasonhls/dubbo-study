package com.example.orderconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 何立森
 * @Date: ${YEAR}/${MONTH}/${DAY}/${TIME}
 * @Description:
 */
@SpringBootApplication
@EnableDubbo
public class OrderServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumerApplication.class, args);
    }
}