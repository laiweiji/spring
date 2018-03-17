package cn.study.entity;

/**
 * Created by 维吉的笔记本 on 2018/1/30.
 */
public class userinfo {

    private int id;

    private String uname;

    private String upassword;

    private  String utype;

    public int getUclassid() {
        return uclassid;
    }

    public void setUclassid(int uclassid) {
        this.uclassid = uclassid;
    }

    private  int uclassid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
}
