package cn.study.servlet;

import cn.study.dao.impl.functions;
import cn.study.entity.achievement;
import cn.study.entity.exam;
import cn.study.entity.userinfo;
import cn.study.services.impl.loginservicesimpl;
import cn.study.services.loginservice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 维吉的笔记本 on 2018/2/1.
 */
public class answerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            request.setCharacterEncoding("utf-8");

        loginservice loo=new loginservicesimpl();



        userinfo us= (userinfo)request.getSession().getAttribute("info");
        boolean pd=false;

        try {
            pd= loo.pd(us.getUname());

            System.out.println(pd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        functions fun=new functions();
        if (pd){



         Date day=new Date();
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         System.out.println(df.format(day));
         System.out.println("进入");



        int row=  Integer.parseInt(request.getParameter("width"));

        System.out.println(row);
        int col=Integer.parseInt( request.getParameter("height"));

        System.out.println(col);

        System.out.println("------------");
        System.out.println(us.getUname());

       // System.out.println(name);

        System.out.println(us.getUname());

        exam ee=new exam();

        for (int i=1;i<=row*col;i++) {

            ee.setTid(i);
            ee.setTime(df.format(day));

            ee.setStuid(us.getId());

            String result = "";


            String[] rs = request.getParameterValues("rchoice" + i);

            if (rs != null) {

                for (String str : rs) {

                    result = result + str;

                }

                ee.setAwthor(result);

                try {

                    int tj = fun.tj(ee);

                    System.out.println("这是"+i);
                    if (tj > 0) {

                        System.out.println("成功");

                    } else {

                        System.out.println("失败");

                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }


            }


        }

            int tsum = 0;
            int i1 =0;
            try {
                System.out.println(us.getUclassid());
                tsum = fun.tsum(us.getUclassid());
                i1=fun.truee(us);
                System.out.println("***************************************");

                System.out.println(tsum);

                System.out.println(i1);

                System.out.println("***************************************");


                achievement ac=new achievement();

                ac.setCid(us.getUclassid());

                ac.setUid(us.getId());

                ac.setTureg(i1);

                ac.setFlaseg(tsum-i1);

                double ff=i1;

                double gg=tsum;

                ac.setFczq((ff/gg)*100);

                ac.getFczq();

                System.out.println(ac.getFczq());

                loo.cc(ac);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else{

            System.out.println("你已经参加过此次考试");
        }

        /*String[] rchoices = request.getParameterValues("rchoice");

        System.out.println(111);





        for (int i=0;i<rchoices.length;i++){

                System.out.println(rchoices[i]);

            }*/




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
