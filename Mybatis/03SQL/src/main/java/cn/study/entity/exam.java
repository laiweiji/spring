package cn.study.entity;

import java.util.Date;

/**
 * Created by 维吉的笔记本 on 2018/2/1.
 */
public class exam {

    private  Integer tid;

    private  String awthor;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String  time;

    private  Date timee;

    public Date getTimee() {
        return timee;
    }

    public void setTimee(Date timee) {
        this.timee = timee;
    }

    private Integer stuid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getAwthor() {
        return awthor;
    }

    public void setAwthor(String awthor) {
        this.awthor = awthor;
    }



    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }
}
