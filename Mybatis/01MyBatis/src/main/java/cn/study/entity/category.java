package cn.study.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public class category implements Serializable {

    private  int cid;

    private  String cname;

    private  int pid;

    private Set<category> cate;

    public int getCid() {
        return cid;
    }

    @Override
    public String toString() {
        return "category{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                ", cate=" + cate +
                '}';
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Set<category> getCate() {
        return cate;
    }

    public void setCate(Set<category> cate) {
        this.cate = cate;
    }
}
