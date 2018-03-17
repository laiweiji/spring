package cn.autowired.entity;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by 维吉的笔记本 on 2018/3/8.
 */
public class Expr implements ThrowsAdvice {

public void afterThrowing(Exception e){

    System.out.println("网络异常");

}


}
