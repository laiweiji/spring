package cn.study.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by 维吉的笔记本 on 2018/3/5.
 */
public class lasraop implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("bengin");
    }
}
