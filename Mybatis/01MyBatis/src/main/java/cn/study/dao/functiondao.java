package cn.study.dao;

import cn.study.entity.*;

import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public interface functiondao {

    public user login(String name, String password);

    public List<user> sep();

    public user logino(String  password);

    public  int up(int bookId,String newh);

    public dept one(int deptid);

    public int inser(String deptname);

    public dept two(int deptid);

    public emp three(int empid);

    public emp four(int empid);

    public teather tea(int tid);

    public List<category> ca(int cid);


}
