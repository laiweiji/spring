package cn.study.entity;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class student {

    private Integer sid;
    private String sname;

    public student() {
        System.out.println("我是student无参构造");
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
