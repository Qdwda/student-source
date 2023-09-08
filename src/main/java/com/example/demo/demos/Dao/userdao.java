package com.example.demo.demos.Dao;

import com.example.demo.demos.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userdao {
    @Select("select * from sourse")
    List<User> sorce();
}

//asdas