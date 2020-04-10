package com.glp.book.controller;

import com.glp.book.dao.BookDao;
import com.glp.book.orm.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookDao bookDao;
    @GetMapping("/findAll")
    @ResponseBody
    public Object findAll(HttpServletRequest request, HttpServletResponse response){
        List<Book> bookList= bookDao.findAll();
        return bookList;
    }
    @PostMapping("/delete")
    public void delete(HttpServletRequest request,HttpServletResponse response){
        String Bid=request.getParameter("Bid");
        bookDao.delete(Integer.valueOf(Bid));
    }
}
