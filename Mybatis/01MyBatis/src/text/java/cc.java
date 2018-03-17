import cn.autowired.dao.impl.RealSubject;
import cn.autowired.dao.impl.dali;
import cn.autowired.entity.Car;
import cn.autowired.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
public class cc {

    @Test
    public void ccd(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application-03.xml");

       Car c= (Car)context.getBean("car");

        System.out.println(c.getName());
    }

    @Test
    public void zj(){

        ApplicationContext context=new ClassPathXmlApplicationContext("application-03.xml");

        Student stu=     (Student)context.getBean("stau");

        System.out.println(stu);

        System.out.println(stu.getName());

        System.out.println(stu.getAge());

    }

    @Test
    public void as(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application-03.xml");
        Student stu=     (Student)context.getBean("stau");
        System.out.println(stu.getName());
        System.out.println(stu.getCa().getName());

    }

    @Test
    public void ad(){

        RealSubject re=new RealSubject();

        dali da=new dali();

        da.setRealSubject(re);

        da.request();


    }



}
