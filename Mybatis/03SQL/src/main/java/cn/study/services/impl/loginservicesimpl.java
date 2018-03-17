package cn.study.services.impl;

import cn.study.dao.impl.functions;
import cn.study.dao.login;
import cn.study.entity.*;
import cn.study.services.loginservice;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/1/30.
 */
public class loginservicesimpl implements loginservice {

    login fu=new functions();

    public userinfo islogin(userinfo us) throws SQLException {
        return fu.islogin(us);
    }

    public List<diction> lis(String gname) throws Exception {
        return fu.lis(gname);
    }

    public int cr(anthor an) throws Exception {
        return fu.inser(an);
    }

    public int tsum(int classid) throws Exception {
        return  fu.tsum(classid);
    }

    public int truee(userinfo us) throws Exception {
        return fu.truee(us);
    }

    public int dele(int cla) throws Exception {
        return fu.dele(cla);
    }

    public boolean pd(String name) throws Exception {
        return fu.pd(name);
    }

    public int cc(achievement an) throws Exception {
        return fu.cc(an);
    }

    public List<achievement> fff(String classname) throws Exception {
        return fu.fff(classname);
    }

    public int max(String classid) throws Exception {
        return fu.max(classid);
    }

    public int min(String  classid) throws Exception {
        return fu.min(classid);
    }

    public int avg(String  classid0) throws Exception {
        return fu.avg(classid0);
    }

    public List<text> falsenum(String classname) throws Exception {
        return fu.falsenum(classname);
    }

    public List<userinfo> findAll() throws Exception {
        return fu.findAll();
    }
}
