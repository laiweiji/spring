package cn.autowired.entity;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 维吉的笔记本 on 2018/3/12.
 */
public class Zq {

    public void befor(){
        System.out.println("===========befo");
    }

    public void afterreturning(){
        System.out.println("===========afterreturning");
    }

    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("=========around");
        point.proceed();
        System.out.println("=======around");
    }

    public void after(){
        System.out.println("==========after");
    }

    public void throwing(){
        System.out.println("===========throwing");
    }

}
