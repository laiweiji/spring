package cn.study.aop;

/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
public class oo {
    private static oo ourInstance = new oo();

    public static oo getInstance() {
        return ourInstance;
    }

    private oo() {
    }
}
