package cn.servlet;

import cn.entity.Page;
import cn.entity.Zh;
import cn.entity.news;
import cn.services.impl.oneserviceimpl;
import cn.services.oneservice;
import cn.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by 维吉的笔记本 on 2018/3/1.
 */

public class oneServlet extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("进入");

        oneservice onese=new oneserviceimpl();

        response.setCharacterEncoding("UTF-8");

        request.setCharacterEncoding("UTF-8");


      //  String pd = request.getParameter("pd");

     //  System.out.println(pd.trim());

        String	 scurrentPage = request.getParameter("currentPage");

        System.out.println("11111111");
        int i=1;
        int a = onese.zz();
        System.out.println("2222222");
        int currentPage = 1; //当前页，默认1
        if(scurrentPage == null){
            currentPage = 1;//从第一页开始访问
        }else{
            currentPage = Integer.parseInt(scurrentPage);
        }

        Page page = PageUtil.createPage(i,a, currentPage);

        System.out.println("3333333333");

        Map<String,Object> ac=new HashMap<String,Object>();

        ac.put("a",page.getBeginIndex());

        ac.put("b",page.getEveryPage());


        List<Zh> zz=new ArrayList<Zh>();



        List<news> sele = onese.sele(ac);

        List<Integer> in=new ArrayList<Integer>();

        System.out.println("********************//////////");
        for (news s:sele
             ) {
            System.out.println(s.getNewsid()+s.getNewstitle()+s.getClickCount()+s.getNewsContent());
            System.out.println(s.getNewsid()+"ididi");
            int ff = onese.ff(s.getNewsid());
            Zh zx=new Zh();
            zx.setId(s.getNewsid());
            zx.setBt(s.getNewstitle());
            zx.setFw(s.getClickCount());
            zx.setPl(ff);
            zz.add(zx);
            System.out.println(ff);
            in.add(ff);

        }
        System.out.println("********************//////////");
        request.setAttribute("page", page);

        request.setAttribute("sl",in);

        request.setAttribute("news",zz);

        request.getRequestDispatcher("/info.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
