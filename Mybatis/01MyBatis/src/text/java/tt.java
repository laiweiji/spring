import cn.autowired.entity.Car;
import cn.study.dao.IBookdao;

import java.io.*;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import cn.study.dao.Student;
import  cn.autowired.entity.*;
import cn.study.dao.functiondao;
import cn.study.dao.happservice;
import cn.study.entity.*;
import cn.study.printer.Pinter;
import cn.study.serviers.Helloseviec;
import cn.study.util.Mybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */

public class tt {

    @Test
    public void one() {

        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        dept one = mapper.one(1);

        List<emp> emps = one.getEmps();

        for (emp l : emps) {

            System.out.println(l.getEmpname());

        }

    }

    @Test
    public void two() {

        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        dept one = mapper.two(1);
        List<emp> emps = one.getEmps();

        for (emp l : emps) {

            System.out.println(l.getEmpname());

        }


    }


    @Test
    public void three() {

        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        emp emp = mapper.three(1);

        dept dd = emp.getDd();

        System.out.println(dd.getDeptname());


    }

    @Test
    public void four() {
        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        emp emp = mapper.four(1);

        dept dd = emp.getDd();

        System.out.println(dd.getDeptname());


    }

    @Test
    public void tea() {
        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        teather tea = mapper.tea(1);

        List<student> stus = tea.getStus();

        for (student stu : stus) {

            System.out.println(stu.getSname());
        }
    }

    @Test
    public void ttr() {
        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        List<category> ca = mapper.ca(1);

        for (category cp : ca) {

            System.out.println(cp);

        }


    }

    @Test
    public void uda() {

        SqlSession session = Mybatis.getOpenSession();

        IBookdao mapper = session.getMapper(IBookdao.class);


        int i = mapper.up(6, 200);

        System.out.println(i);
    }

    @Test
    public void day() {

        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);

        dept one = mapper.one(1);


        System.out.println(one.getDeptname());

        System.out.println("***********************************************************");

        int i = mapper.inser("领事部");

        System.out.println(i);


        System.out.println("***********************************************************");


        dept o = mapper.one(1);

        System.out.println(o.getDeptname());

    }

    @Test
    public void erji() {

        SqlSession session = Mybatis.getOpenSession();

        functiondao mapper = session.getMapper(functiondao.class);


        dept one = mapper.two(1);


        System.out.println(one.getDeptname());


        System.out.println("***********************************************************");

        SqlSession session1 = Mybatis.getOpenSession();

        functiondao mapper1 = session1.getMapper(functiondao.class);


        dept o = mapper1.two(1);

        System.out.println(o.getDeptname());
    }

    @Test
    public void Spring() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        happservice bean = (happservice) context.getBean("services");

        System.out.println(bean.getName() + bean.getAge());

    }

    @Test
    public void pinter() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pinter pinter = (Pinter) context.getBean("Pinter");

        pinter.pin();


    }

    @Test
    public void tweo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");

//        Helloseviec hh=  (Helloseviec)context.getBean("service");
//
//        hh.some();

        Student jk = (Student) context.getBean("stu");
        Student j = (Student) context.getBean("stu");
        System.out.println(jk);
        System.out.println(j);
        System.out.println(j.getName());
        System.out.println(j.getAge());
        System.out.println(jk.getName());
        System.out.println(jk.getAge());
    }

    @Test
    public void ffo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");
        Collcation c = (Collcation) context.getBean("ms");

        System.out.println(c);


    }

    @Test
    public void fgfg() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");

        Car ac = (Car) context.getBean("car");

    }

    @Test
    public void hh() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-04.xml");

        Cdd c = (Cdd) context.getBean("Proxy");

        try {
            c.some();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void ddd() {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-04.xml");

        Cdd s = (Cdd) context.getBean("Proxy");

        s.some();

    }

    @Test
    public void textone() throws  Exception{

        File file = new File("e://file//test.txt");

        URL url = new URL("http://tieba.baidu.com/p/4529628420");

        URLConnection conn = url.openConnection();

        conn.setConnectTimeout(1000 * 10);

        BufferedReader bufr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        System.out.println(bufr);

        Writer wt = new FileWriter(file,true);

        PrintWriter pw = new PrintWriter(wt,true);

        String line = null;
        //匹配email的正则
        String regex = "[a-zA-Z0-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
        Pattern p = Pattern.compile(regex);
        while((line = bufr.readLine()) != null) {
            Matcher m = p.matcher(line);
            while(m.find()) {
                System.out.println(m);
                //写入到文件
               // pw.write(m.group()+"/n");
                //获得匹配的email
                System.out.println(m.group());
            }
        }

        pw.flush();

        pw.close();

        bufr.close();


    }

    @Test
public void ss()throws Exception{
        picture pi=new picture();

    File file = new File("e://file//test.txt");
    //链接到需要提取内容的网页
    URL url = new URL("http://www.58pic.com/c/13931065");
    //打开连接
    URLConnection conn = url.openConnection();
    //设置连接网络超时时间
    conn.setConnectTimeout(1000 * 10);
    //读取指定网络地址中的文件 （输入缓冲流）
    BufferedReader bufr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    System.out.println(bufr);
    //将内容保存到text.txt文件中（输出缓冲流）
    Writer wt = new FileWriter(file,true);
    //将字符流包装成缓冲流
    PrintWriter pw = new PrintWriter(wt,true);

    String line = null;
    //匹配email的正则

        int ii=(int)((Math.random()*9+1)*1000);
    String regex = "<img[\\w\\W]*?src=[\"|\']?([\\w\\W]*?)(jpg|png)[\\w\\W]*?/>";
    Pattern p = Pattern.compile(regex);
    while((line = bufr.readLine()) != null) {
        Matcher m = p.matcher(line);
        while(m.find()) {
            System.out.println(m);
            //写入到文件
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            String a=m.group(1);
            String b=m.group(2);
            String c=a+b;
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println("111111111111111111111111");
            System.out.println(c);
//            URL u=new URL(c);
//            URLConnection cone=u.openConnection();
//            String str=cone.getHeaderField(0);
//            System.out.println(str);
//
//            if (str.indexOf("OK")> 0){
//                //网址正常
//                System.out.println("zzzzz");
//            }else{
//                //网址不正常
//                System.out.println("tttttt");
//            }

            boolean isurl = false;
            String reogex = "(((https|http)?://)?([a-z0-9]+[.])|(www.))"
                    + "\\w+[.|\\/]([a-z0-9]{0,})?[[.]([a-z0-9]{0,})]+((/[\\S&&[^,;\u4E00-\u9FA5]]+)+)?([.][a-z0-9]{0,}+|/?)";//设置正则表达式

            Pattern pat = Pattern.compile(reogex.trim());//比对

            Matcher mat = pat.matcher(c.trim());

            isurl = mat.matches();//判断是否匹配
            if (isurl) {
                isurl = true;
                System.out.println("zzzzzzzzzzzzz");
                ii++;
                String uo=""+ii;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                pi.mai(c,uo.trim()+"."+b);

            }else{
                System.out.println("tttttttttt");
            }


            System.out.println("222222222222222222222222");
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            // pw.write(m.group());
            //获得匹配的email
            System.out.println(m.group());
        }
    }

}

@Test
public void ghh(){



}

}




