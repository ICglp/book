package com.glp.book.dao;

import com.glp.book.orm.CateGoty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CateGotyDao {
    //查询所有类别
    @Select("select * from categoryinfo")
    List<CateGoty> findAll();

    //根据id删除类别
    @Delete("DELETE FROM categoryinfo WHERE Cid=#{id}")
    boolean delete(int id);

    //添加类别
    @Insert("insert into categoryinfo (Cid,Cname)values(0,#{Cname})")
    boolean add(String Cname);

    //根据id查类别
    @Select("select * from categoryinfo where Cid=#{id}")
    CateGoty findByID(int Cid);
}
