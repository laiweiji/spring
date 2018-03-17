package cn.autowired.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by 维吉的笔记本 on 2018/3/12.
 */
@Aspect
public class Lpg  {

    @Pointcut("execution(* *..autowired.dao.impl.Seppp.insert(..))")
    public  void inse(){

    }

     @Before("execution(* *..autowired.dao.impl.Seppp.select(..))")
    public void befo(){
         System.out.println("aaaaas");
     }

     @AfterReturning("inse()")
    public void after(){
         System.out.println("bbbbbbbb");
     }

     @AfterThrowing("execution(* *..autowired.dao.impl.Seppp.select(..))")
    public void ing(){
         System.out.println("Exception");
     }

     @Around("execution(* *..autowired.dao.impl.Seppp.select(..))")
     public  void around(ProceedingJoinPoint jion) throws Throwable {
         System.out.println("前");
         jion.proceed();
         System.out.println("后");
     }

     @After("execution(* *..autowired.dao.impl.Seppp.select(..))"  )
     public  void ss(){
         System.out.println("end");
     }
}
