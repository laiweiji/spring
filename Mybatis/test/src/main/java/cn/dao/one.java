package cn.dao;

import cn.entity.news;
import cn.entity.talk;

import java.util.List;
import java.util.Map;

/**
 * Created by 维吉的笔记本 on 2018/3/1.
 */
public interface one {

    public List<news> sele(Map<String,Object> aa);

    public int ff(int nid);

    public int zz();

    public int up(int newsid);

    public news ne(int newsid);

    public int inser(Map<String,Object> as);

    public List<talk> ta(int nid);

}
