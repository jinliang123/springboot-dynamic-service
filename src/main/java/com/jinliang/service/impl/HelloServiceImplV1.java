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
@DynamicServiceImpl(tenant="A")
public class HelloServiceImplV1 implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("A Hello Service");
    }

    @Override
    public void sayHi() {
        System.out.println("A Hello Service");
    }
}
