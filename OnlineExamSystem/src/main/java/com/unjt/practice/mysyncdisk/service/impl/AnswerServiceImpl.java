package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.mapper.AnswerMapper;
import com.unjt.practice.mysyncdisk.service.AnswerService;
import com.unjt.practice.mysyncdisk.vo.AnswerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Page<AnswerVO> findAll(Page<AnswerVO> page) {
        List<AnswerVO> answerVOList = answerMapper.findAll((page.getCurrent() - 1) * page.getSize(), page.getSize());
        Page<AnswerVO> answerVOPage = new Page<>(page.getCurrent(), page.getSize());
        answerVOPage.setTotal(answerVOList.size());
        answerVOPage.setRecords(answerVOList);
        return answerVOPage;
    }
}
