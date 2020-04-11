package com.glp.book.service.Impl;

import com.glp.book.dao.BookDao;
import com.glp.book.orm.Book;
import com.glp.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    //查询所有图书
    public List<Book> findAll() {
        List<Book> bookList=bookDao.findAll();
        return bookList;
    }

    @Override
    public boolean delete(int id) {
        boolean relt=false;
        try {
            relt=bookDao.delete(id);
        }catch (Exception e){
            return relt;
        }
        return relt;
    }

    @Override
    public boolean add(Book book) {
        boolean relt=false;
        try {
            relt=bookDao.add(book);
        }catch (Exception e){
            return relt;
        }
        return relt;
    }

    @Override
    public boolean update(Book book) {
        boolean relt=false;
        try {
            relt=bookDao.update(book);
        }catch (Exception e){
            return relt;
        }
        return relt;
    }
}
