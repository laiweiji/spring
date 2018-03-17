package cn.study.dao.impl;

import cn.study.dao.BaseDao;
import cn.study.dao.login;
import cn.study.entity.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/1/30.
 */
public class functions extends BaseDao implements login {

    public userinfo islogin(userinfo us) throws SQLException {

        userinfo u = new userinfo();

        String sql = "SELECT * FROM userinfo WHERE uname=? AND upassword=?";

        ResultSet set = executeQuery(sql, us.getUname(), us.getUpassword());

        if (set != null) {

            while (set.next()) {

                String uname = set.getString("uname");


                if (uname != null) {
                    u.setUname(uname);
                    u.setId(set.getInt("id"));

                    u.setUpassword(set.getString("upassword"));

                    u.setUtype(set.getString("utype"));

                    u.setUclassid(set.getInt("uclassid"));

                }

                String upassword = set.getString("upassword");

                if (upassword != null) {
                    u.setUpassword(upassword);

                }

            }


        }


        return u;
    }

    public int tj(exam ee) throws Exception {

        String sql = "INSERT INTO `examd`(`tid`,`Answer`,`examtime`,`name`) VALUES (?,?,?,?)";

        int i = executeUpdate(sql, ee.getTid(), ee.getAwthor(), ee.getTime(), ee.getStuid());

        return i;
    }

    public List<diction> lis(String gname) throws Exception {

        String sql = "SELECT gid FROM  sys_dicationry WHERE gname=?";

        List<diction> lis = new ArrayList<diction>();

        ResultSet set = executeQuery(sql, gname);

        int a = 0;
        while (set.next()) {
            a = set.getInt("gid");

        }

        String s = a + "";

        String ss = s.trim();

        String sql1 = "SELECT * FROM sys_dicationry WHERE gtype=?";

        ResultSet set1 = executeQuery(sql1, ss);

        while (set1.next()) {

            diction cd = new diction();

            cd.setId(set1.getInt("id"));

            cd.setSid(set1.getInt("gid"));

            cd.setGname(set1.getString("gname"));

            cd.setGtype(set1.getString("gtype"));

            lis.add(cd);


        }


        return lis;

    }

    public int inser(anthor an) throws Exception {

        System.out.println("----------------------------------------");
        System.out.println(an.getClassid());

        System.out.println(an.getId());

        System.out.println(an.getTeacher());

        System.out.println(an.getAnthor().trim());

        System.out.println("----------------------------------------");

        String sql = "INSERT INTO anthor VALUES (DEFAULT,?,?,?,?)";

        int i = executeUpdate(sql, an.getClassid(), an.getTid(), an.getTeacher(), an.getAnthor());

        return i;
    }

    public int tsum(int cl) throws Exception {
        String sql = "SELECT COUNT(*) as a FROM `anthor` WHERE classid=?";
        ResultSet Set = executeQuery(sql, cl);
        int a = 0;
        while (Set.next()) {
            a = Set.getInt("a");


        }

        System.out.println("***************----------------");
        System.out.println(a);
        System.out.println("***************----------------");
        return a;
    }

    public int truee(userinfo us) throws Exception {

        String sql = "SELECT COUNT(*) as a FROM `anthor` AS a,`examd` AS b WHERE a.tid=b.tid AND b.name=(SELECT uname FROM `userinfo` WHERE uclassid=? AND id=?) AND a.anthor=b.Answer";

        ResultSet set = executeQuery(sql, us.getUclassid(), us.getId());

        int a = 0;

        while (set.next()) {

            a = set.getInt("a");

        }


        return a;
    }

    public int dele(int cla) throws Exception {

        String sql = "DELETE FROM `anthor` WHERE classid=?";

        int i = executeUpdate(sql, cla);

        return i;
    }

    public boolean pd(String name) throws Exception {

        String sql = "SELECT * FROM `examd` WHERE NAME=?";

        ResultSet set = executeQuery(sql, name);

        exam ee = new exam();
        while (set.next()) {

            ee.setTid(set.getInt("tid"));
            ee.setAwthor(set.getString("Answer"));

        }
        boolean flag = false;
        System.out.println("////////////////////");
        System.out.println(ee.getTid());
        if (ee.getTid() == null) {
            flag = true;
        }
        System.out.println("////////////////////");


        return flag;
    }

    public int cc(achievement an) throws Exception {

        System.out.println("插入数据库");
        String sql = "INSERT INTO `achievement` (`id`,`classid`,`uid`,`true`,`false`,`Fraction`) VALUES (DEFAULT,?,?,?,?,?)";

        int i = executeUpdate(sql, an.getCid(), an.getUid(), an.getTureg(), an.getFlaseg(), an.getFczq());

        return i;
    }

    public List<achievement> fff(String classname) throws Exception {
        List<achievement> ac = new ArrayList<achievement>();
        String sql = "SELECT a.gname as aa,b.uname as bb,c.Fraction as cc FROM `sys_dicationry` AS a,`userinfo` AS b,`achievement` AS c WHERE a.id=b.uclassid   AND  a.id=c.classid AND  b.uclassid=c.classid AND a.gname=? AND b.id=c.uid";
        ResultSet set = executeQuery(sql, classname);
        while (set.next()) {
            achievement as = new achievement();
            as.setClassd(set.getString("aa"));

            as.setName(set.getString("bb"));

            as.setFen(set.getInt("cc"));

            ac.add(as);

        }


        return ac;
    }

    public int max(String classid) throws Exception {
        String sql = "SELECT  MAX(fraction) AS a FROM  `achievement`  WHERE classid=(SELECT id FROM `sys_dicationry` WHERE gname=?) ";

        ResultSet set = executeQuery(sql, classid);

        int a = 0;

        while (set.next()) {

            a = set.getInt("a");

        }

        return a;
    }

    public int min(String classid) throws Exception {

        String sql = "SELECT  MIN(fraction) as a FROM  `achievement`  WHERE classid=(SELECT id FROM `sys_dicationry` WHERE gname=?)";

        ResultSet set = executeQuery(sql, classid);

        int a = 0;

        while (set.next()) {

            a = set.getInt("a");

        }

        return a;
    }

    public int avg(String classid) throws Exception {
        String sql = "SELECT  AVG(fraction) AS a FROM  `achievement`  WHERE classid=(SELECT id FROM `sys_dicationry` WHERE gname=?)";
        ResultSet resultSet = executeQuery(sql, classid);

        int a = 0;

        while (resultSet.next()) {


            a = resultSet.getInt("a");

        }

        return a;
    }

    public List<text> falsenum(String classname) throws Exception {

        List<text> li = new ArrayList<text>();


        String sql1 = "SELECT id FROM `sys_dicationry` WHERE gname=?";

        ResultSet set = executeQuery(sql1, classname);

        int a = 0;

        while (set.next()) {

            a = set.getInt("id");

        }

        String sql = "SELECT COUNT(*) as bb FROM `anthor` WHERE classid=?";

        int b = 0;

        ResultSet set1 = executeQuery(sql, a);

        while (set1.next()) {

            b = set1.getInt("bb");
        }

        int truee = 0;
        int count = 0;
        for (int i = 1; i <= b; i++) {

            System.out.println(i);
            String sql3 = "SELECT COUNT(*) as cc FROM `userinfo` WHERE uclassid=?";

            ResultSet lii = executeQuery(sql3, a);

            while (lii.next()) {

                count = lii.getInt("cc");

            }

            String sql2 = "SELECT  COUNT(*) as xx FROM `examd` AS a ,`anthor` AS b WHERE a.tid=b.tid AND a.tid=？";

            ResultSet set2 = executeQuery(sql2, i);

            while (set2.next()) {

                truee = set2.getInt("xx");

            }


            text tex = new text();

            tex.setTid(i);

            tex.setFalseNumber(count - truee);

            li.add(tex);


        }

        return li;
    }

    public List<userinfo> findAll() throws Exception {
        String sql="select * from `userinfo` ";

        List<userinfo> lis=new ArrayList<userinfo>();

        ResultSet set = executeQuery(sql);

        while(set.next()){
            userinfo us=new userinfo();

            us.setId(set.getInt("id"));

            us.setUname(set.getString("uname"));

            us.setUpassword(set.getString("upassword"));

            us.setUclassid(set.getInt("uclassid"));

            us.setUtype(set.getString("utype"));

            lis.add(us);

        }

        return lis;
    }

}