package com.jinliang.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * description
 *
 * @author jinliang 2019/01/11 11:30
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface DynamicServiceImpl {
    String tenant() default "0";
}
