package com.jinliang.controller;


import com.jinliang.annotation.RoutingInjected;
import com.jinliang.service.CustomerService;
import com.jinliang.service.HelloService;
import com.jinliang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author jinliang 2019/01/11 12:51
 */
@RestController
public class UserController {
    @RoutingInjected
    private HelloService helloService;

    @RoutingInjected
    private UserService userService;

    @Autowired
    private CustomerService customerService;
    @RequestMapping("/user")
    public void sayHello(){
        this.helloService.sayHello();
        System.out.println(this.userService.getUserName(1L));
        System.out.println(this.customerService.getCustomerName(1L));
    }

    public void sayHi(){
        this.helloService.sayHi();
    }

}
