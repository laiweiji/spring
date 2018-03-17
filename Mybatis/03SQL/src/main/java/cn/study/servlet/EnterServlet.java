package cn.study.servlet;

import cn.study.entity.*;
import cn.study.services.impl.loginservicesimpl;
import cn.study.services.loginservice;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/1.
 */
public class EnterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

           request.setCharacterEncoding("utf-8");

        System.out.println("成功");

        String s = request.getParameter("action");

        System.out.println(s);

        if (s.trim().equals("add")) {


        loginservice lo=new loginservicesimpl();

        String ii = request.getParameter("ii");

        System.out.println(ii);

        try {
            List<diction> lis = lo.lis(ii);

            for (diction de:lis){

                System.out.println(de.getGname());

            }

           String c= JSON.toJSONString(lis);

            PrintWriter pw=response.getWriter();

            pw.write(c);

            pw.flush();;

            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        }else if (s.trim().equals("addd")){

            loginservice lo=new loginservicesimpl();

            anthor an=new anthor();

            userinfo info =(userinfo) request.getSession().getAttribute("info");

            int classname=info.getUclassid();



            String text = request.getParameter("text").trim();

            String se = request.getParameter("se").trim();

            try {
                int dele = lo.dele(Integer.parseInt(se));



            }catch (Exception e){
                
            }
             int classs= Integer.parseInt(se);

             an.setClassid(classs);

            String teacher = request.getParameter("uname");

            an.setTeacher(teacher);

            System.out.println(text);

            System.out.println(se);


            int aa=0;

            String [] ser=text.split(",");

            for (int i=0;i<ser.length;i++){

                aa++;
               an.setTid(aa);
               an.setAnthor(ser[i].trim());
                System.out.println(ser[i]);

                try {

                    int cr = lo.cr(an);

                    if (cr>0){

                        System.out.println("cg");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

           // for (String ioi:ser){
                //题号
             //   i++;


          //  }

        }else if (s.trim().equals("addf")){
            System.out.println(s.trim());


            String ii = request.getParameter("ii");

            System.out.println(ii);

            System.out.println(ii);

            loginservice lo=new loginservicesimpl();

            try {

                List<achievement> fff = lo.fff(ii);


                String s1 = JSON.toJSONString(fff);

                PrintWriter pw=response.getWriter();

                pw.write(s1);

                pw.flush();

                pw.close();


            } catch (Exception e) {

                e.printStackTrace();
            }


        }else  if(s.trim().equals("addK")){



            System.out.println(s);

            System.out.println("进入addK");

            System.out.println("这是分数");

            String ii = request.getParameter("ii");

            System.out.println(ii);

            loginservice lo=new loginservicesimpl();
            try {
                int max = lo.max(ii.trim());

                int min = lo.min(ii.trim());

                int avg = lo.avg(ii.trim());

                int [] fen=new int[3];

                fen[0]=max;

                fen[1]=min;

                fen[2]=avg;

                String s1 = JSON.toJSONString(fen);

                PrintWriter pw=response.getWriter();

                pw.write(s1);

                pw.flush();;

                pw.close();



            }catch (Exception e){

                e.printStackTrace();

            }


        }else if(s.trim().equals("addl")){

            System.out.println(s);

            String ii = request.getParameter("ii");

            loginservice lo=new loginservicesimpl();


            try {
                System.out.println(ii);

                PrintWriter pw=response.getWriter();

                List<text> list = lo.falsenum(ii);


                for (text lis:list){

                    System.out.println(lis.getTid());

                    System.out.println(lis.getFalseNumber());

                }


                String s1 = JSON.toJSONString("list");

                pw.write(s1);

                pw.flush();

                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }








        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
