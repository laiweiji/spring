package cn.autowired.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
@Component("stau")
public class Student {

    @Value("xxx")
    private  String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Value("18")
    private Integer age;

   // @Resource(name = "car")
    @Autowired()
   @Qualifier(value = "car")
    private  Car ca;



    public Car getCa() {
        return ca;
    }

    public void setCa(Car ca) {
        this.ca = ca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
