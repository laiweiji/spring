package cn.study.services;

import cn.study.entity.*;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/1/30.
 */
public interface loginservice {
    public userinfo islogin(userinfo us) throws SQLException;

    public List<diction> lis (String gname) throws  Exception;

    public int cr(anthor an) throws  Exception;

    public int tsum(int classid) throws  Exception;

    public int truee(userinfo us) throws  Exception;

    public int dele(int cla) throws  Exception;

    public boolean pd(String name) throws  Exception;

    public int cc(achievement an) throws Exception;

    public List<achievement>  fff(String classname) throws  Exception;

    public int max(String classid) throws Exception;

    public int min(String  classid)throws  Exception;

    public int avg(String classid0) throws Exception;

    public List<text>  falsenum(String classname)throws  Exception;

    public List<userinfo> findAll() throws Exception;
}
