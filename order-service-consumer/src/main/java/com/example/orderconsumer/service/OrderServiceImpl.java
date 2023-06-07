package com.example.orderconsumer.service;

import com.example.commonapi.bean.UserAddress;
import com.example.commonapi.service.OrderService;
import com.example.commonapi.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 何立森
 * @Date: 2023/06/07/11:48
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    /**
     * 调用远程接口，指定端口，关闭自启动检查
     */
    @DubboReference(interfaceClass = UserService.class, check = false)
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
