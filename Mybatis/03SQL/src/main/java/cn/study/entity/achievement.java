package cn.study.entity;

/**
 * Created by 维吉的笔记本 on 2018/2/3.
 */
public class achievement {

    private  int id;

    private  int cid;

    private  int uid;

    private  int tureg;

    private  int flaseg;

    private double Fczq;

    private  int fen;

    private String classd;

    private  String name;

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }

    public String getClassd() {
        return classd;
    }

    public void setClassd(String classd) {
        this.classd = classd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTureg() {
        return tureg;
    }

    public void setTureg(int tureg) {
        this.tureg = tureg;
    }

    public int getFlaseg() {
        return flaseg;
    }

    public void setFlaseg(int flaseg) {
        this.flaseg = flaseg;
    }

    public double getFczq() {
        return Fczq;
    }

    public void setFczq(double fczq) {
        Fczq = fczq;
    }
}
