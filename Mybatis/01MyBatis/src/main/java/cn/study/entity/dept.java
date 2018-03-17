package cn.study.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class dept implements  Serializable {

    private  int deptid;

    private  String deptname;

    private List<emp>  emps =new ArrayList<emp>();

    public List<emp> getEmps() {
        return emps;
    }

    public void setEmps(List<emp> emps) {
        this.emps = emps;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
