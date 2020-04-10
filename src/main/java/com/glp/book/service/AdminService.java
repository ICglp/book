package com.glp.book.service;

import com.glp.book.orm.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    Admin login(Admin admin);
}
