package com.glp.book.dao;

import com.glp.book.orm.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookDao {
    //查询所有图书
    @Select("select * from bookinfo")
    List<Book> findAll();

    //删除图书
    @Delete("DELETE FROM bookinfo WHERE Bid=#{id}")
    boolean delete(int id);

    //添加图书
    @Insert("insert into bookinfo (Bid,BTitle,BAuthor,BPrice,BCategoryID,BPublisher,BPhoto)values(0,#{book.BTitle},#{book.BAuthor},#{book.BPrice},#{book.BCategoryID},#{book.BPublisher},#{book.BPhoto})")
    boolean add(Book book);

    //修改图书
    @Update("")
    boolean update()
}
