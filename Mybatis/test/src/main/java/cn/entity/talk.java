package cn.entity;

import java.util.*;

/**
 * Created by 维吉的笔记本 on 2018/3/1.
 */
public class talk {

    private  int tid;

    private  String  content;

    private Date talktme;

    private int nid;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTalktme() {
        return talktme;
    }

    public void setTalktme(Date talktme) {
        this.talktme = talktme;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }
}
