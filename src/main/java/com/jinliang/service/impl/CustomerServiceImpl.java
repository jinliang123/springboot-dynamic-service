package com.jinliang.service.impl;

import com.jinliang.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author jinliang 2019/01/11 12:43
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String getCustomerName(Long customerId) {
        return "customer service";
    }
}
