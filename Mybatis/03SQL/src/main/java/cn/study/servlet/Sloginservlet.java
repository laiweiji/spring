package cn.study.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import cn.study.entity.userinfo;
import cn.study.dao.impl.functions;
import cn.study.services.impl.loginservicesimpl;
import cn.study.services.loginservice;

/**
 * Created by 维吉的笔记本 on 2018/1/30.
 */
public class Sloginservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String userCode = request.getParameter("userCode");

        String userPassword = request.getParameter("userPassword");

        userinfo us=new userinfo();

        us.setUname(userCode);

        us.setUpassword(userPassword);

        loginservice lo=new loginservicesimpl();

        try {

            userinfo islogin = lo.islogin(us);

            if (islogin!=null){

                String uname = islogin.getUname();

                if(uname!=null){

                    request.getSession().setAttribute("info",islogin);

                    request.getRequestDispatcher("/page/Index.jsp").forward(request,response);

                }else{

                    response.sendRedirect(request.getContextPath()+"/page/login.jsp");

                }

            }else{

                response.sendRedirect(request.getContextPath()+"/page/login.jsp");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                    doPost(request,response);
    }
}
