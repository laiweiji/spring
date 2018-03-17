package cn.study.dao;

/**
 * Created by 维吉的笔记本 on 2018/3/5.
 */
public class Student  {

    private String name;

    private Integer age;

    public  void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }
}
