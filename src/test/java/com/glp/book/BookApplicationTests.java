package com.glp.book;

import com.glp.book.dao.AdminDao;
import com.glp.book.dao.BookDao;
import com.glp.book.orm.Admin;
import com.glp.book.orm.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class BookApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        bookDao.add(new Book(1,"AA","AA",1.11,1,"AA","AA"));
    }

}
