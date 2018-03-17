package JIHE.DAO.impl;

import JIHE.DAO.Buy;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by 维吉的笔记本 on 2018/3/15.
 */
public class Buyimpl extends JdbcDaoSupport implements Buy {
    public boolean abuy(int aid, int abalance, boolean isBuy) {

        String sql;
        if(isBuy){

            sql="update auser set amoney=amoney-? where aid=?";

        }else{

            sql="update auser set amoney=amoney+? where aid=?";

        }

        int update = this.getJdbcTemplate().update(sql, abalance, aid);

        boolean flag=false;
        if(update>0){
            flag=true;
        }else{
            flag=false;
        }

        return flag;
    }
}
