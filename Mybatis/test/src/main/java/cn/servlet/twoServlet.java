package cn.servlet;

import cn.entity.news;
import cn.entity.talk;
import cn.services.impl.oneserviceimpl;
import cn.services.oneservice;
import org.apache.ibatis.ognl.IntHashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 维吉的笔记本 on 2018/3/1.
 */

public class twoServlet extends HttpServlet {
    oneservice onese=new oneserviceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          request.setCharacterEncoding("UTF-8");

          response.setCharacterEncoding("UTF-8");

        String pp = request.getParameter("pp");

        System.out.println(pp.trim());

        if (pp.trim().equals("look")){

            String uid = request.getParameter("uid");

            System.out.println(uid);

            oneservice onese=new oneserviceimpl();

            int up = onese.up(Integer.parseInt(uid));

            System.out.println(up);

            news ne = onese.ne(Integer.parseInt(uid));

            System.out.println("import ");
            System.out.println(ne.getNewsid());
            System.out.println("import ");
            System.out.println(ne.getClickCount());

            System.out.println(ne.getNewsContent());

            System.out.println(ne.getNewstitle());
            List<talk> ta = onese.ta(Integer.parseInt(uid));

            System.out.println("111222333444");
            for (talk t:ta){

                System.out.println(t.getContent()+t.getTalktme());

            }
            System.out.println("111222333444");
            request.setAttribute("use",ne);


            request.setAttribute("talk",ta);

            request.getRequestDispatcher("/look.jsp").forward(request,response);

        }else if(pp.trim().equals("ty")){

            String tt = request.getParameter("tt");
            System.out.println("id+"+request.getParameter("uid"));
            String nid=request.getParameter("uid");
            System.out.println(tt);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

            Map<String,Object> as=new HashMap<String,Object>();

            as.put("nid",nid);

           as.put("content",tt);

           as.put("talktme",df.format(new Date()));

            int i = onese.inser(as);

            System.out.println(i);

            response.sendRedirect("oneServlet");


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
