package com.glp.book.dao;

import com.glp.book.orm.Book;
import com.glp.book.orm.CateGoty;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookDao {
    //查询所有图书
    @Select("select * from bookinfo")
    @Results({
            @Result(id=true,property = "Bid",column = "Bid"),
            @Result(property = "BTitle",column = "BTitle"),
            @Result(property = "BAuthor",column = "BAuthor"),
            @Result(property = "BPrice",column = "BPrice"),
            @Result(property = "BCategoryID",column = "BCategoryID"),
            @Result(property = "BPublisher",column = "BPublisher"),
            @Result(property = "BPhoto",column = "BPhoto"),
            @Result(property = "cateGoty",column = "BCategoryID",javaType = CateGoty.class,
                    one = @One(select = "com.glp.book.dao.CateGotyDao.findByID",fetchType = FetchType.DEFAULT))
    })
    List<Book> findAll();

    //删除图书
    @Delete("DELETE FROM bookinfo WHERE Bid=#{id}")
    boolean delete(int id);

    //添加图书
    @Insert("insert into bookinfo (Bid,BTitle,BAuthor,BPrice,BCategoryID,BPublisher,BPhoto)values(0,#{BTitle},#{BAuthor},#{BPrice},#{BCategoryID},#{BPublisher},#{BPhoto})")
    boolean add(Book book);

    //修改图书
    @Update("update bookinfo set BTitle=#{BTitle},BAuthor=#{BAuthor},BPrice=#{BPrice},BCategoryID=#{BCategoryID},BPublisher=#{BPublisher},BPhoto=#{BPhoto} where Bid=#{Bid}")
    boolean update(Book book);

    @Select("select * from bookinfo where Bid=#{id}")
    Book findByID(int id);
}
