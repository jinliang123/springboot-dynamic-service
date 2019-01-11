package com.jinliang.service.impl;

import com.jinliang.annotation.DynamicServiceImpl;
import com.jinliang.service.UserService;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author jinliang 2019/01/11 9:50
 */
@Service
@DynamicServiceImpl(tenant="B")
public class UserServiceImplV2 implements UserService {

    @Override
    public String getUserName(Long userId) {
        return "B User Service";
    }
}
