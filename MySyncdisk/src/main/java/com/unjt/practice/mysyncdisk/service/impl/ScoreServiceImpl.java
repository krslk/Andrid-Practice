package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Score;
import com.unjt.practice.mysyncdisk.mapper.ScoreMapper;
import com.unjt.practice.mysyncdisk.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public int add(Score score) {
        return scoreMapper.add(score);
    }

    @Override
    public List<Score> findAll() {
        return scoreMapper.findAll();
    }

    @Override
    public Page<Score> findById(Page page, Integer studentId) {
        List<Score> scoreList = scoreMapper.findById((page.getCurrent() - 1) * page.getSize(), page.getSize(), studentId);
        Page<Score> scorePage = new Page<>(page.getCurrent(), page.getSize());
        scorePage.setTotal(scoreList.size());
        scorePage.setRecords(scoreList);
        return scorePage;
    }

    @Override
    public List<Score> findById(Integer studentId) {
        return scoreMapper.noPageFindById(studentId);
    }

    @Override
    public List<Score> findByExamCode(Integer examCode) {
        return scoreMapper.findByExamCode(examCode);
    }
}
