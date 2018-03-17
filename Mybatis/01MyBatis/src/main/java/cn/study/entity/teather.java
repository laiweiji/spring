package cn.study.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class teather {

    private Integer tid;
    private String tname;
    //植入学生集合
    private List<student> stus=new ArrayList<student>();

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<student> getStus() {
        return stus;
    }

    public void setStus(List<student> stus) {
        this.stus = stus;
    }
}
