package com.glp.book.service.Impl;

import com.glp.book.dao.AdminDao;
import com.glp.book.orm.Admin;
import com.glp.book.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin login(Admin admin) {
        Admin admin1=null;
        try {
            Admin newadmin = adminDao.findByID(admin.getAloginID());
            if (admin.getAloginPsw()==newadmin.getAloginPsw()){
                admin1=newadmin;
            }
        }catch (Exception e){
            return admin1;
        }
        return admin1;
    }

}
