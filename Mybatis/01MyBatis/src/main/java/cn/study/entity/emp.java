package cn.study.entity;

import java.io.Serializable;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class emp implements Serializable {
    private  int empid;

    private  String empname;

    private  dept dd;

    public dept getDd() {
        return dd;
    }

    public void setDd(dept dd) {
        this.dd = dd;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
}
