package com.example.commonapi.service;

import com.example.commonapi.bean.UserAddress;

import java.util.List;

/**
 * @Author: 何立森
 * @Date: 2023/06/07/11:24
 * @Description:
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     * @return
     */
    List<UserAddress> initOrder(String userId);
}
