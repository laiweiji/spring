package cn.study.printer;

import cn.study.ink.ink;
import cn.study.paper.Paper;

/**
 * Created by 维吉的笔记本 on 2018/3/3.
 */
public class Pinter {

    private ink in;

    private Paper paper;

    public void pin(){

        System.out.println("用"+in.color()+"在用"+paper.Size());

    }

    public ink getIn() {
        return in;
    }

    public void setIn(ink in) {
        this.in = in;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
