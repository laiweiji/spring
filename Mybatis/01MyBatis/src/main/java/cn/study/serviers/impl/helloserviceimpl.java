package cn.study.serviers.impl;

import cn.study.dao.HelloServices;
import cn.study.dao.Student;
import cn.study.dao.impl.HelloServiceimpl;
import cn.study.serviers.Helloseviec;

/**
 * Created by 维吉的笔记本 on 2018/3/5.
 */
public class helloserviceimpl implements Helloseviec {

    HelloServices he;

    Student stu;


    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;

    }

    public void some() {

        he.some();

    }

    public HelloServices getHe() {
        return he;
    }

    public void setHe(HelloServices he) {
        this.he = he;
    }
}
