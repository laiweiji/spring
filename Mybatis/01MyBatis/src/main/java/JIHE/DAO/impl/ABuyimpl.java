package JIHE.DAO.impl;

import JIHE.DAO.ABuy;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by 维吉的笔记本 on 2018/3/15.
 */
public class ABuyimpl extends JdbcDaoSupport implements ABuy {


    public boolean Buystock(int sid,int scount,boolean isBuy) {
        String sql;



        if(isBuy){

            sql="update stoke set smoney=smoney+? where sid=?";

        }else{

            sql="update stoke set smoney=smoney-? where sid=?";

        }

        int update = this.getJdbcTemplate().update(sql,scount, sid);

        boolean flag=false;
        if(update>0){
            flag=true;
        }else{
            flag=false;
        }

        return flag;

    }
}
