package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Teacher;
import com.unjt.practice.mysyncdisk.mapper.TeacherMapper;
import com.unjt.practice.mysyncdisk.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Page<Teacher> findAll(Page<Teacher> page) {
        List<Teacher> teacherList = teacherMapper.findAll((page.getCurrent() - 1) * page.getSize(), page.getSize());
        Page<Teacher> teacherPage = new Page<>(page.getCurrent(), page.getSize());
        teacherPage.setTotal(teacherList.size());
        teacherPage.setRecords(teacherList);
        return teacherPage;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.noPageFindAll();
    }

    @Override
    public Teacher findById(Integer teacherId) {
        return teacherMapper.findById(teacherId);
    }

    @Override
    public int deleteById(Integer teacherId) {
        return teacherMapper.deleteById(teacherId);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }

    @Override
    public int add(Teacher teacher) {
        return teacherMapper.add(teacher);
    }
}
