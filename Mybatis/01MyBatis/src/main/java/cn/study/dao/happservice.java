package cn.study.dao;

/**
 * Created by 维吉的笔记本 on 2018/3/3.
 */
public class happservice {

    public happservice(){

        System.out.println("=======happservice==========");

    }

    private  String name;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public   void show(){

        System.out.println("name:"+this.name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
