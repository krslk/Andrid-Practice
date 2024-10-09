package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.ExamManage;
import com.unjt.practice.mysyncdisk.mapper.ExamManageMapper;
import com.unjt.practice.mysyncdisk.service.ExamManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamManageServiceImpl implements ExamManageService {
    @Autowired
    private ExamManageMapper examManageMapper;

    @Override
    public List<ExamManage> findAll() {
        return examManageMapper.noPageFindAll();
    }

    @Override
    public Page<ExamManage> findAll(Page<ExamManage> page) {
        List<ExamManage> examManages = examManageMapper.findAll((page.getCurrent() - 1) * page.getSize(), page.getSize());
        Page<ExamManage> examManagePage = new Page<>(page.getCurrent(), page.getSize());
        examManagePage.setTotal(Integer.valueOf(examManages.size()));
        examManagePage.setRecords(examManages);
        return examManagePage;
    }

    @Override
    public ExamManage findById(Integer examCode) {
        return examManageMapper.findById(examCode);
    }

    @Override
    public int delete(Integer examCode) {
        return examManageMapper.delete(examCode);
    }

    @Override
    public int update(ExamManage exammanage) {
        return examManageMapper.update(exammanage);
    }

    @Override
    public int add(ExamManage exammanage) {
        return examManageMapper.add(exammanage);
    }

    @Override
    public ExamManage findOnlyPaperId() {
        return examManageMapper.findOnlyPaperId();
    }
}
