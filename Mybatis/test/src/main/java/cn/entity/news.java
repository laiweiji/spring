package cn.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/3/1.
 */
public class news {

    private  int  newsid;

    private  String newstitle;

    private  String newsContent;

    private int clickCount;

    private List<talk> ta=new ArrayList<talk>();

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public List<talk> getTa() {
        return ta;
    }

    public void setTa(List<talk> ta) {
        this.ta = ta;
    }
}
