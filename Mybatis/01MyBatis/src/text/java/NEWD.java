import JIHE.Except.Spt;
import JIHE.service.Bu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 维吉的笔记本 on 2018/3/15.
 */
public class NEWD {

    @Test
    public  void srt() throws Spt {

        ApplicationContext context=new ClassPathXmlApplicationContext("application-06.xml");

        Bu trans = (Bu) context.getBean("trans");

        trans.bu(1,20,1,20);

    }

}
