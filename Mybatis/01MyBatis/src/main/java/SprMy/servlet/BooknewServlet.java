package SprMy.servlet;


import SprMy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import spring.service.Bookservice;

import  SprMy.entity.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 维吉的笔记本 on 2018/3/17.
 */

public class BooknewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               request.setCharacterEncoding("UTF-8");

               String name=request.getParameter("bookname");

               String price=request.getParameter("bookprice");

               Integer pr=Integer.parseInt(price);

               String author=request.getParameter("bookauthor");

        book book=new book();

        book.setBname(name);
        book.setBprice(pr);

        ApplicationContext  context= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        BookService service = (BookService) context.getBean("service");

        int i = service.insertbook(book);

        if (i>0){

            request.getRequestDispatcher("/insert.jsp").forward(request,response);

        }else{
            response.sendRedirect("/insert.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }
}
