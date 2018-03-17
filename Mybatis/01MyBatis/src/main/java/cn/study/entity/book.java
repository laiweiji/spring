package cn.study.entity;

/**
 * Created by 维吉的笔记本 on 2018/1/27.
 */
public class book {
    private Integer bookId;

    private String  bookName;

    private String bookAthor;

    private Integer bookPrice;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAthor() {
        return bookAthor;
    }

    public void setBookAthor(String bookAthor) {
        this.bookAthor = bookAthor;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

}
