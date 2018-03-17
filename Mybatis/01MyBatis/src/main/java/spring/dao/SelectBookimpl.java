package spring.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import spring.entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 维吉的笔记本 on 2018/3/13.
 */
public class SelectBookimpl extends JdbcDaoSupport implements SelectBook {





    public List<Book> booklist() {
        String sql="select * from book";
        List<Book> query = this.getJdbcTemplate().query(sql, new RowMapper<Book>() {
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book bo = new Book();
                bo.setBookid(resultSet.getInt("bookId"));
                bo.setBookname(resultSet.getString("bookName"));
                bo.setBookAuthor(resultSet.getString("bookAuthor"));
                bo.setBookprice(resultSet.getInt("bookPrice"));
                return bo;
            }
        });
        return query;
    }




}
