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
@DynamicServiceImpl(tenant="0")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(Long userId) {
        return "0 User　Service";
    }
}
