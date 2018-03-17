package cn.study.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 维吉的笔记本 on 2018/2/24.
 */
public class Mybatis {

    static InputStream is;
    static SqlSessionFactory factory;
    static {
        try {
            is= Resources.getResourceAsStream("mybatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getOpenSession(){
        return factory.openSession(true);
    }


}
