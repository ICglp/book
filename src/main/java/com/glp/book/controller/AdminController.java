package com.glp.book.controller;

import com.glp.book.orm.Admin;
import com.glp.book.orm.CateGoty;
import com.glp.book.service.AdminService;
import com.glp.book.service.CateGotyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private CateGotyService cateGotyService;
    @Autowired
    private AdminService adminService;
    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        String aloginID = request.getParameter("AloginID");
        String aloginPsw = request.getParameter("AloginPsw");
        String cb = request.getParameter("cb");
        Admin admin=new Admin(1,aloginID,Integer.valueOf(aloginPsw),"");
        Admin admin1 = adminService.login(admin);
        if (admin1!=null){
            if (cb!=null){
                Cookie cookie=new Cookie("remebername",admin1.getAloginID());
                Cookie cookie1=new Cookie("remeberpwd",String.valueOf(admin1.getAloginPsw()));
                cookie.setMaxAge(60*60*24*7);
                response.addCookie(cookie1);
                response.addCookie(cookie);
            }
            request.getSession().setAttribute("name",admin1.getAname());
            return "index";
        }
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        request.getSession().invalidate();
        return "login";
    }

}
