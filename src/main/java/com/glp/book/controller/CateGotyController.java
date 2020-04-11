package com.glp.book.controller;

import com.glp.book.orm.CateGoty;
import com.glp.book.service.CateGotyService;
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
@RequestMapping("/categoty")
public class CateGotyController {
    @Autowired
    private CateGotyService cateGotyService;
    @GetMapping("/findAll")
    @ResponseBody
    public Object findAll(HttpServletRequest request, HttpServletResponse response){
        List<CateGoty> cateGotyList=cateGotyService.findAll();
        return cateGotyList;
    }

    @GetMapping("/delete")
    public String delete(HttpServletRequest request,HttpServletResponse response){
        String Cid=request.getParameter("Cid");
        if (Cid!=null){
            cateGotyService.delete(Integer.valueOf(Cid));
        }
        return "index";
    }

    @PostMapping("/add")
    public String add(HttpServletRequest request,HttpServletResponse response){
        String Cname=request.getParameter("catename");
        if (Cname!=null){
            cateGotyService.add(Cname);
        }
        return "redirect:/jsp/index.jsp";
    }
}
