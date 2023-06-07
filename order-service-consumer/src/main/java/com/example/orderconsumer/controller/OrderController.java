package com.example.orderconsumer.controller;

import com.example.commonapi.bean.UserAddress;
import com.example.commonapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 何立森
 * @Date: 2023/06/07/11:47
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getOrder")
    public List<UserAddress> getOrder(@RequestParam("userId") String userId) {
        return orderService.initOrder(userId);
    }
}
