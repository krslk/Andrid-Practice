package com.unjt.practice.mysyncdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.vo.AnswerVO;

public interface AnswerService {

    IPage<AnswerVO> findAll(Page<AnswerVO> page);
}
