package cn.study.dao;


import cn.study.entity.book;

import java.util.List;
import java.util.Map;

/**
 * Created by 维吉的笔记本 on 2018/1/27.
 */
public interface IBookdao {

    public List<book> books();

    public book one(Integer bookId);


    public  int inser(book bo);
     public  int up(int bookId,int pa);

    public  int del(int bookId);

    public  List<book> selectone(Map<String,Object> map);

    public List<book> selecttwo(String bookName,Integer bookPrice);

    public List<book> findnew(book bo);

    public  List<book> findo(int [] bookids);

    public List<book> findt(List<Integer> list);

    public List<book> findth(List<book> lo);




}
