package cn.autowired.dao.impl;

import cn.autowired.dao.Subject;

/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
public class dali implements Subject {

    private  RealSubject realSubject=new RealSubject();


    public RealSubject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request()
    {

        System.out.println("a");


        realSubject.request();


        System.out.println("b");
    }
}
