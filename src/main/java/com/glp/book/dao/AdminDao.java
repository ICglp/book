package com.glp.book.dao;

import com.glp.book.orm.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminDao {
    @Select("select * from admininfo where AloginID=#{AloginID}")
    Admin findByID(String AloginID);
}
