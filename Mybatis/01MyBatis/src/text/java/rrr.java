
import cn.autowired.dao.Lpg;
import cn.autowired.dao.Sel;
import cn.autowired.dao.impl.Seppp;
import cn.autowired.entity.textc;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.entity.Book;
import spring.service.Bookservice;

import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/3/12.
 */
public class rrr {
    @Test
    public void dgh() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-05.xml");
        Sel ss = (Sel) context.getBean("service");
        try {
            ss.select();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

@Test
    public  void tt(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-05.xml");
        textc ss = (textc) context.getBean("text");
        try {


       ss.look();
    }catch (Exception e){
            e.printStackTrace();;

        }
    }


    @Test
    public void cs(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-05.xml");
        Bookservice service = (Bookservice) context.getBean("service");


        List<Book> booklist = service.booklist();

        for (Book bo:booklist){
            System.out.println(bo.getBookname());

        }
    }

}
