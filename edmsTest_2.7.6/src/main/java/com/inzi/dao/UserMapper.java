package com.inzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.inzi.User;

@Mapper
public interface UserMapper {

    List<User> findAll();
}
