package com.unjt.practice.mysyncdisk.service.impl;

import com.unjt.practice.mysyncdisk.entity.Admin;
import com.unjt.practice.mysyncdisk.entity.Student;
import com.unjt.practice.mysyncdisk.entity.Teacher;
import com.unjt.practice.mysyncdisk.mapper.LoginMapper;
import com.unjt.practice.mysyncdisk.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Admin adminLogin(Integer username, String password) {
        return loginMapper.adminLogin(username, password);
    }

    @Override
    public Teacher teacherLogin(Integer username, String password) {
        return loginMapper.teacherLogin(username, password);
    }

    @Override
    public Student studentLogin(Integer username, String password) {
        return loginMapper.studentLogin(username, password);
    }
}
