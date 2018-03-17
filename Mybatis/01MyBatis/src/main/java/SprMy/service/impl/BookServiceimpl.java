package SprMy.service.impl;

import SprMy.dao.IBook;
import SprMy.entity.book;
import SprMy.service.BookService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 维吉的笔记本 on 2018/3/17.
 */
public class BookServiceimpl implements BookService {
    private IBook bk;

    public IBook getBk() {
        return bk;
    }

    public void setBk(IBook bk) {
        this.bk = bk;
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public int insertbook(book bo) {



        return    bk.insertbook(bo);
    }
}
