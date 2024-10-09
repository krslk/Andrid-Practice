package com.unjt.practice.mysyncdisk.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.vo.AnswerVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface AnswerMapper {
    @Select("select question, subject, score, section,level, \"选择题\" as type from multi_question " +
            "union select  question, subject, score, section,level, \"判断题\" as type  from judge_question " +
            "union select  question, subject, score, section,level, \"填空题\" as type from fill_question limit #{offset},#{size}")
    List<AnswerVO> findAll(Long offset, Long size);
}
