package cn.study.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by 维吉的笔记本 on 2018/3/5.
 */
public class fristaop implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

        System.out.println("日志记录");

    }
}
