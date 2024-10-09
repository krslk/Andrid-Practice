package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Student;
import com.unjt.practice.mysyncdisk.mapper.StudentMapper;
import com.unjt.practice.mysyncdisk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Page<Student> findAll(Page<Student> page) {
        List<Student> studentList = studentMapper.findAll((page.getCurrent() - 1) * page.getSize(), page.getSize());
        Page<Student> studentPage = new Page<>(page.getCurrent(), page.getSize());
        studentPage.setTotal(studentList.size());
        studentPage.setRecords(studentList);
        return studentPage;
    }

    @Override
    public Student findById(Integer studentId) {
        return studentMapper.findById(studentId);
    }

    @Override
    public int deleteById(Integer studentId) {
        return studentMapper.deleteById(studentId);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int updatePwd(Student student) {
        return studentMapper.updatePwd(student);
    }

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }
}
