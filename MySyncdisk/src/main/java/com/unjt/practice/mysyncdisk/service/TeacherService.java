package com.unjt.practice.mysyncdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Teacher;

import java.util.List;

public interface TeacherService {

    Page<Teacher> findAll(Page<Teacher> page);

    public List<Teacher> findAll();

    public Teacher findById(Integer teacherId);

    public int deleteById(Integer teacherId);

    public int update(Teacher teacher);

    public int add(Teacher teacher);
}
