package cn.autowired.entity;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by 维吉的笔记本 on 2018/3/8.
 */
public class Befo implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("aaaaaaaaa");
    }
}
