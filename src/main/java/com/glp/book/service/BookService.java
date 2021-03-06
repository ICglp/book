package com.glp.book.service;

import com.glp.book.orm.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    //查询所有图书
    List<Book> findAll();

    //根据id删除图书
    boolean delete(int id);

    //添加图书
    boolean add(Book book);

    //修改图书
    boolean update(Book book);

    Book findByID(int id);
}
