package cn.autowired.entity;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by 维吉的笔记本 on 2018/3/8.
 */
public class Jack implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {


        System.out.println("=====aa");


        methodInvocation.proceed();


        System.out.println("==============bb");

        return null;
    }
}
