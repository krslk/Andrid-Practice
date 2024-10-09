package com.unjt.practice.mysyncdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Score;

import java.util.List;

public interface ScoreService {
    int add(Score score);

    List<Score> findAll();

    Page<Score> findById(Page page, Integer studentId);

    List<Score> findById(Integer studentId);

    List<Score> findByExamCode(Integer examCode);
}
