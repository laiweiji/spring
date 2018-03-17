package cn.study.serviers.impl;


import cn.study.dao.functiondao;
import cn.study.entity.user;
import cn.study.serviers.oneservice;
import cn.study.util.Mybatis;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class oneservicesimpl  implements oneservice {
    public user login(String name, String password) {

        System.out.println(name);


        System.out.println(password);
        System.out.println("进入");
        SqlSession getsession = Mybatis.getOpenSession();
        System.out.println("进入");
        functiondao mapper = getsession.getMapper(functiondao.class);
        System.out.println("进入");

        user login = mapper.login(name.trim(), password.trim());

      //  System.out.println(login.getUserName());

        return login;
    }

    public user logino(String password) {

        SqlSession getsession = Mybatis.getOpenSession();
        System.out.println("进入");
        functiondao mapper = getsession.getMapper(functiondao.class);

        user logino = mapper.logino(password);

       // int i=logino.getId();

        if(logino!=null){

            return logino;

        }else{


        }



        return null;
    }

    public int up(int bookId, String newh) {
        SqlSession getsession = Mybatis.getOpenSession();
        System.out.println("进入");
        functiondao mapper = getsession.getMapper(functiondao.class);
        int up = mapper.up(bookId,newh);

        return up;
    }

    public List<user> sep() {
        SqlSession getsession = Mybatis.getOpenSession();
        System.out.println("进入");
        functiondao mapper = getsession.getMapper(functiondao.class);
        List<user> sep = mapper.sep();
        return sep;
    }
}
