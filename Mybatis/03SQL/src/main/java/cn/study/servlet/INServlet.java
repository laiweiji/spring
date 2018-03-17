package cn.study.servlet;

import cn.study.entity.userinfo;
import cn.study.services.impl.loginservicesimpl;
import cn.study.services.loginservice;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 维吉的笔记本 on 2018/2/6.
 */
public class INServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        loginservice lo=new loginservicesimpl();


        System.out.println("aaaaaaaaaaaaa-----------------------------");

        try {
            List<userinfo> list = lo.findAll();

            for(userinfo us:list){

                System.out.println(us.getUname());

            }

            Map<String,Object> io=new HashMap<String,Object>();

            response.setCharacterEncoding("UTF-8");

            io.put("total",list.size());

            io.put("rows",list);

            String s = JSON.toJSONString(io);

            response.getWriter().write(s);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
