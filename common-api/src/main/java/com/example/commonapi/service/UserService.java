package com.example.commonapi.service;

import com.example.commonapi.bean.UserAddress;

import java.util.List;

/**
 * @Author: 何立森
 * @Date: 2023/06/07/11:24
 * @Description:
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收获地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
