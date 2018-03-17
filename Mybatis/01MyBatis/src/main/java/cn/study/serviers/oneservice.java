package cn.study.serviers;

import cn.study.entity.user;

import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/2/26.
 */
public interface oneservice {
    public user login(String name, String password);
    public user logino(String  password);
    public  int up(int bookId,String newh);
    public List<user> sep();
}
