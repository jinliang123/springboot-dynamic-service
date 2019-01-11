package com.jinliang.service.impl;


import com.jinliang.annotation.DynamicServiceImpl;
import com.jinliang.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author jinliang 2019/01/11 8:52
 */
@Service
@DynamicServiceImpl(tenant="B")
public class HelloServiceImplV2 implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("B Hello Service");
    }

    @Override
    public void sayHi() {
        System.out.println("B Hello Service");
    }
}
