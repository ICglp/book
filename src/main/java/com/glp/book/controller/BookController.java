package com.glp.book.controller;

import com.glp.book.dao.BookDao;
import com.glp.book.orm.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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
    @GetMapping("/delete")
    public void delete(HttpServletRequest request,HttpServletResponse response){
        String Bid=request.getParameter("Bid");
        bookDao.delete(Integer.valueOf(Bid));
    }
    @PostMapping("/add")
    public void add(HttpServletRequest request,HttpServletResponse response,@RequestParam("file")MultipartFile file) throws Exception {
        String originalFilename = file.getOriginalFilename();
        String extention = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileNameNew = UUID.randomUUID() + "." + extention;
        File file1=new File("/imgs/"+fileNameNew);
        file.transferTo(file1);
        Book book=new Book();
        String bTitle = request.getParameter("BTitle");
        String bAuthor = request.getParameter("BAuthor");
        String bPrice = request.getParameter("BPrice");
        String bPublisher = request.getParameter("BPublisher");
        String bCategoryID = request.getParameter("BCategoryID");
        book.setBTitle(bTitle);
        book.setBAuthor(bAuthor);
        book.setBPrice(Double.parseDouble(bPrice));
        book.setBPublisher(bPublisher);
        book.setBPhoto(fileNameNew);
        book.setBCategoryID(Integer.valueOf(bCategoryID));
        bookDao.add(book);
    }
    @PostMapping("/update")
    public void update(HttpServletRequest request,HttpServletResponse response,@RequestParam("file")MultipartFile file) throws Exception {
        String fileNameNew=null;
        if (file!=null){
            String originalFilename = file.getOriginalFilename();
            String extention = originalFilename.substring(originalFilename.lastIndexOf("."));
            fileNameNew = UUID.randomUUID() + "." + extention;
            File file1=new File("/imgs/"+fileNameNew);
            file.transferTo(file1);
        }else {
            fileNameNew=request.getParameter("usedFileName");
        }
        Book book=new Book();
        String bid = request.getParameter("Bid");
        String bTitle = request.getParameter("BTitle");
        String bAuthor = request.getParameter("BAuthor");
        String bPrice = request.getParameter("BPrice");
        String bPublisher = request.getParameter("BPublisher");
        String bCategoryID = request.getParameter("BCategoryID");
        book.setBid(Integer.valueOf(bid));
        book.setBTitle(bTitle);
        book.setBAuthor(bAuthor);
        book.setBPrice(Double.parseDouble(bPrice));
        book.setBPublisher(bPublisher);
        book.setBPhoto(fileNameNew);
        book.setBCategoryID(Integer.valueOf(bCategoryID));
        bookDao.update(book);
    }
}
