package com.inzi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inzi.dao.UserMapper;

@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    // 멤버 전체 조회
    public int getAllUsers() {
        final List<User> userList = userMapper.findAll();
        if (userList.isEmpty())
            return 1;
        return 2;
    }
}
