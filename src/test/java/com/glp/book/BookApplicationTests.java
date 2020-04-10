package com.glp.book;

import com.glp.book.dao.AdminDao;
import com.glp.book.orm.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookApplicationTests {
    @Autowired
    private AdminDao adminDao;
    @Test
    void contextLoads() {
        Admin admin=adminDao.findByID("zhangsan");
        System.out.println(admin);
    }

}
