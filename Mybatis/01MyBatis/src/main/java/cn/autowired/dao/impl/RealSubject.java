package cn.autowired.dao.impl;

import cn.autowired.dao.Subject;

/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("我是xxx");
    }
}
