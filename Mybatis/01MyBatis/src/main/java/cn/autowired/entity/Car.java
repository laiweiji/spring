package cn.autowired.entity;

import cn.study.dao.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
@Component("car")
public class Car {
    @Value("兰博基尼")
    private String name;
    @Value("1")
    private  int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
