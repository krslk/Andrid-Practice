package com.unjt.practice.mysyncdisk.service;

import com.unjt.practice.mysyncdisk.entity.Admin;
import com.unjt.practice.mysyncdisk.entity.Student;
import com.unjt.practice.mysyncdisk.entity.Teacher;

public interface LoginService {

    public Admin adminLogin(Integer username, String password);

    public Teacher teacherLogin(Integer username, String password);

    public Student studentLogin(Integer username, String password);
}
