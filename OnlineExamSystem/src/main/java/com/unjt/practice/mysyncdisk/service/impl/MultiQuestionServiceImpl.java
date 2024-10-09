package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.MultiQuestion;
import com.unjt.practice.mysyncdisk.mapper.MultiQuestionMapper;
import com.unjt.practice.mysyncdisk.service.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultiQuestionServiceImpl implements MultiQuestionService {

    @Autowired
    private MultiQuestionMapper multiQuestionMapper;

    @Override
    public List<MultiQuestion> findByIdAndType(Integer PaperId) {
        return multiQuestionMapper.findByIdAndType(PaperId);
    }

    @Override
    public Page<MultiQuestion> findAll(Page<MultiQuestion> page) {
        List<MultiQuestion> multiQuestionList = multiQuestionMapper.findAll((page.getCurrent() - 1) * page.getSize(), page.getSize());
        Page<MultiQuestion> multiQuestionPage = new Page<>(page.getCurrent(), page.getSize());
        page.setTotal(multiQuestionList.size());
        page.setRecords(multiQuestionList);
        return multiQuestionPage;
    }

    @Override
    public MultiQuestion findOnlyQuestionId() {
        return multiQuestionMapper.findOnlyQuestionId();
    }

    @Override
    public int add(MultiQuestion multiQuestion) {
        return multiQuestionMapper.add(multiQuestion);
    }

    @Override
    public List<Integer> findBySubject(String subject, Integer pageNo) {
        return multiQuestionMapper.findBySubject(subject, pageNo);
    }
}
