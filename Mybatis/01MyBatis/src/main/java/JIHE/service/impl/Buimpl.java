package JIHE.service.impl;

import JIHE.DAO.ABuy;
import JIHE.DAO.Buy;
import JIHE.Except.Spt;
import JIHE.service.Bu;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 维吉的笔记本 on 2018/3/15.
 */
public class Buimpl implements Bu {

    private Buy a;

    private ABuy b;

    public Buy getA() {
        return a;
    }

    public void setA(Buy a) {
        this.a = a;
    }

    public ABuy getB() {
        return b;
    }

    public void setB(ABuy b) {
        this.b = b;
    }

   //@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Spt.class)
    public boolean bu(int aid, int acount, int sid, int scount) throws Spt {
        boolean flag=false;

        if(1==1){
            throw new Spt("error");
        }
        boolean bs = a.abuy(aid, acount, flag);

        boolean b1 = b.Buystock(sid, scount, flag);

        if (bs&&b1){
            flag=true;
        }else{
            flag=false;
        }

        return flag;
    }
}
