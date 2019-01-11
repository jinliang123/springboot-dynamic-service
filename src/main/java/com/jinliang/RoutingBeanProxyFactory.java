package com.jinliang;

import com.jinliang.annotation.DynamicServiceImpl;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;

import java.util.HashMap;
import java.util.Map;


/**
 * 代理类生成
 *
 * @author jinliang 2019/01/11 9:01
 */
public class RoutingBeanProxyFactory {
    public static Object createProxy(Class targetClass, Map<String, Object> beans) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(targetClass);
        proxyFactory.addAdvice(new VersionRoutingMethodInterceptor(beans));
        return proxyFactory.getProxy();
    }
    static class VersionRoutingMethodInterceptor implements MethodInterceptor {
         Map<String,Object> tenantBeans = new HashMap<>();

        public VersionRoutingMethodInterceptor(Map<String, Object> beans) {
            //拿到实现类上注解中配置的租户编码
            for(Map.Entry<String,Object> entry:beans.entrySet()){
                Object obj = entry.getValue();
                if(obj.getClass().isAnnotationPresent(DynamicServiceImpl.class)){
                    String tenantCode = obj.getClass().getAnnotation(DynamicServiceImpl.class).tenant();
                    tenantBeans.put(tenantCode,obj);
                }
            }
        }


        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            return invocation.getMethod().invoke(getTargetBean(), invocation.getArguments());
        }

        public Object getTargetBean() {
            Object obj = this.tenantBeans.get(getCurrentTeant());
            if(obj != null){
                return obj;
            }
            return this.tenantBeans.get("0");
        }

        //设置租户ID
        private String getCurrentTeant() {
            return "0";
        }
    }


}
