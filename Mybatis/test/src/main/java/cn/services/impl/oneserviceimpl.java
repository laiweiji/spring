package cn.services.impl;

import cn.dao.one;
import cn.entity.news;
import cn.entity.talk;
import cn.services.oneservice;
import cn.util.*;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

/**
 * Created by 维吉的笔记本 on 2018/3/1.
 */
public class oneserviceimpl implements oneservice {


    public List<news> sele(Map<String,Object> ac) {

        System.out.println("343434343434");




        //System.out.println(a);
       // System.out.println(b);
        SqlSession session = Mybatis.getSession();
        one mapper = session.getMapper(one.class);

        System.out.println("454545454545");

        System.out.println("****************-----***************");

        Collection<Object> values = ac.values();     // 得到全部的value变为Collection集合
        Iterator<Object> iterr = values.iterator();        // 实例化Iterator对象

        while (iterr.hasNext()){
            Object next = iterr.next();
            System.out.println(next);    // 输出value
        }




        Set<String> keys = ac.keySet();      // 得到全部的key变成Set集合



        Iterator<String> iter = keys.iterator();      // 实例化Iterator对象

        while (iter.hasNext()){
            String str = iter.next();   // 取出key
            System.out.println(str);    // 输出key
        }
        System.out.println("****************--------------**********");


        List<news> sele = mapper.sele(ac);

        System.out.println("++++++++++++");

        for (news sel:sele){

            System.out.println(sel.getNewsid()+sel.getNewstitle());

        }

        System.out.println("++++++++++++");


        System.out.println("63636363");

        return sele;
    }

    public int zz() {
        System.out.println("111212121212");

        SqlSession session = Mybatis.getSession();

        System.out.println("020202020202");
        one mapper = session.getMapper(one.class);


        int i = mapper.zz();

        System.out.println("32323232323");

        System.out.println(i);
        System.out.println("3232323323232");

        return i;
    }

    public int up(int newsid) {
        SqlSession session = Mybatis.getSession();

        System.out.println("020202020202");
        one mapper = session.getMapper(one.class);

        int i = mapper.up(newsid);
        System.out.println(i);
        return i;
    }

    public news ne(int newsid) {
        SqlSession session = Mybatis.getSession();

        System.out.println("020202020202");
        one mapper = session.getMapper(one.class);

        news ne = mapper.ne(newsid);


        return ne;
    }

    public List<talk> ta(int nid) {
        System.out.println("talk");
        System.out.println(nid);
        SqlSession session = Mybatis.getSession();

        System.out.println("020202020202");
        one mapper = session.getMapper(one.class);
        List<talk> ta = mapper.ta(nid);

        return ta;
    }

    public int inser(Map<String, Object> as) {
        SqlSession session = Mybatis.getSession();
        System.out.println("inset");
        System.out.println("020202020202");
        one mapper = session.getMapper(one.class);
        int inser1 = mapper.inser(as);
        System.out.println(inser1);
        return inser1;
    }

    public int ff(int nid) {
        SqlSession session = Mybatis.getSession();
        System.out.println("inset");
        System.out.println("020202020202");
        one mapper = session.getMapper(one.class);
        int i = mapper.ff(nid);
        System.out.println(i);
        return i;
    }
}
