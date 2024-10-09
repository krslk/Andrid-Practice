package com.unjt.practice.mysyncdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.ExamManage;

import java.util.List;

public interface ExamManageService {

    /**
     * 不分页查询所有考试信息
     */
    List<ExamManage> findAll();
    Page<ExamManage> findAll(Page<ExamManage> page);

    ExamManage findById(Integer examCode);

    int delete(Integer examCode);

    int update(ExamManage exammanage);

    int add(ExamManage exammanage);

    ExamManage findOnlyPaperId();
}
