package com.glp.book.service;

import com.glp.book.orm.CateGoty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CateGotyService {
    //查询所有类别
    List<CateGoty> findAll();

    //根据id删除类别
    boolean delete(int id);

    //添加类别
    boolean add(String Cname);
}
