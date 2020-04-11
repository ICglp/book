package com.glp.book.service.Impl;

import com.glp.book.dao.CateGotyDao;
import com.glp.book.orm.CateGoty;
import com.glp.book.service.CateGotyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateGotyServiceImpl implements CateGotyService {
    @Autowired
    private CateGotyDao cateGotyDao;
    //查询所有类别
    public List<CateGoty> findAll() {
        List<CateGoty> cateGotyList=cateGotyDao.findAll();
        return cateGotyList;
    }

    @Override
    public boolean delete(int id) {
        boolean relt=false;
        try {
            relt=cateGotyDao.delete(id);
        }catch (Exception e){
            return relt;
        }
        return relt;
    }

    //添加类别
    public boolean add(String Cname) {
        boolean relt=false;
        try {
            relt=cateGotyDao.add(Cname);
        }catch (Exception e){
            return relt;
        }
        return relt;
    }

    @Override
    public CateGoty findByID(int id) {
        CateGoty cateGoty = cateGotyDao.findByID(id);
        return cateGoty;
    }
}
