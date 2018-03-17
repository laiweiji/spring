package cn.autowired.test;

import cn.autowired.dao.textdao;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



/**
 * Created by 维吉的笔记本 on 2018/3/6.
 */
@Controller
public class OtherController {

    @Autowired
    private textdao te;






}
