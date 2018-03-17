package cn.study.servlet;

import cn.study.dao.functiondao;
import cn.study.entity.user;
import cn.study.serviers.impl.oneservicesimpl;
import cn.study.serviers.oneservice;
import cn.study.util.Mybatis;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class funServlet extends javax.servlet.http.HttpServlet {

    oneservice one=new oneservicesimpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setCharacterEncoding("UTF-8");

        request.setCharacterEncoding("UTF-8");

        System.out.println("aaaaaaaaa");

        String username = request.getParameter("username");

        String password = request.getParameter("password");

        String pd=request.getParameter("pd");

        System.out.println("--------------------");
        System.out.println(pd);
        System.out.println("---------------------");


        System.out.println("aaaaaaaaa");


  if( pd.trim().equals("login")) {

      System.out.println("登录");

      user login = one.login(username, password);

      System.out.println("denglu");

      //    System.out.println(login.getUserName());

      System.out.println("aaaaaaaaa");
      if (login != null) {

          if (login.getUserName() != null) {

              request.getSession().setAttribute("user", login);

              System.out.println("进入登录");



              request.getRequestDispatcher("/welcome.jsp").forward(request, response);


          } else if (login.getUserName() == null) {

              System.out.println("登陆错误");
              response.sendRedirect(request.getContextPath() + "/login.jsp");

          }


      } else {
          response.sendRedirect(request.getContextPath() + "/login.jsp");

      }

  }else if (pd.trim().equals("update")){
      String oldPassword = request.getParameter("oldPassword");
      String newPassword = request.getParameter("newPassword");
      String reNewPassword = request.getParameter("reNewPassword");

      System.out.println(oldPassword);

      System.out.println(newPassword);

      System.out.println(reNewPassword);
      System.out.println("//////////////");
      System.out.println("进入修改");
      System.out.println("==============");

      user logino = one.logino(oldPassword);


      System.out.println("******************");
     // System.out.println(logino.getId());
      System.out.println("******************");

      if(logino.getId()!=null){

          if(newPassword.equals(reNewPassword)) {

              int i=100;

              System.out.println(i);

              System.out.println(logino.getId());
               i = one.up(logino.getId(), reNewPassword);

              System.out.println(i);

              if (i > 0) {

                  System.out.println("成功");

              } else {

                  System.out.println("失败");

                  response.sendRedirect(request.getContextPath() + "/password.jsp");
              }
          }
          response.sendRedirect(request.getContextPath() + "/login.jsp");

      }else{

          response.sendRedirect(request.getContextPath() + "/login.jsp");

      }

  }else if (pd.trim().equals("error")){

      System.out.println(pd.trim());

       request.getSession().removeAttribute("user");

      response.sendRedirect(request.getContextPath() + "/login.jsp");

  }else if(pd.trim().equals("user")){


      System.out.println("用户");

      List<user> sep = one.sep();

      for (user  u:sep
           ) {
          System.out.println(u.getUserName());
      }
      request.setAttribute("sep",sep);

      request.getRequestDispatcher("/userList.jsp").forward(request, response);


  }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

          doPost(request,response);

    }
}
