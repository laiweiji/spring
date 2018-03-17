import cn.autowired.entity.SomeServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 维吉的笔记本 on 2018/3/8.
 */
public class text {
    public static void main(String[] args) {

        final SomeServiceImpl some=new SomeServiceImpl();

        Enhancer enhancer=new Enhancer();

        enhancer.setSuperclass(some.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("aaaaaaaa");
                methodProxy.invoke(some,objects);
                return null;
            }
        });

        SomeServiceImpl ss=  (SomeServiceImpl)enhancer.create();

        ss.Some();




    }
}
