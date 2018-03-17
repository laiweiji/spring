package spring.service.impl;

import spring.dao.SelectBook;
import spring.dao.SelectBookimpl;
import spring.entity.Book;
import spring.service.Bookservice;

import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/3/13.
 */
public class Bookserviceimpl implements Bookservice {
    SelectBook se;

    public SelectBook getSe() {
        return se;
    }

    public void setSe(SelectBook se) {
        this.se = se;
    }

    public List<Book> booklist() {
        return se.booklist();
    }
}
