package com.jinliang.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * description
 *
 * @author jinliang 2019/01/11 8:54
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RoutingInjected{
}