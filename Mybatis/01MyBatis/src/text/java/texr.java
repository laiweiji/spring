import cn.autowired.entity.Isomeservice;
import cn.autowired.entity.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 维吉的笔记本 on 2018/3/8.
 */
public class texr {

    public static void main(String[] args) {

        final Isomeservice se=new SomeServiceImpl();


        Isomeservice proxy=(Isomeservice) Proxy.newProxyInstance(se.getClass().getClassLoader(),
                se.getClass().getInterfaces(), new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("lalalaalal");
                        method.invoke(se,args);
                        return null;
                    }
                });



        proxy.Some();
    }

}
