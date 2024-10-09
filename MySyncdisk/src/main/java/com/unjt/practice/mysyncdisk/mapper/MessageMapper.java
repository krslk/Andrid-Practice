package com.unjt.practice.mysyncdisk.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {
    @Select("select id,id as temp_id,title,content,time from message order by id desc limit #{offset},#{size}")
    @Results({
            @Result(property = "replays", column = "temp_id",many = @Many(select = "com.exam.mapper.ReplayMapper.findAllById"))
    })
    List<Message> findAll(Long offset, Long size);

    @Select("select id,title,content,time from message where id = #{id}")
    @Results({
            @Result(property = "replays", column = "id",many = @Many(select = "com.exam.mapper.ReplayMapper.findAllById"))
    })
    Message findById(Integer id);

    @Delete("delete from message where id = #{id}")
    int delete(Integer id);

    @Update("update message set title = #{title}, content = #{content}, time = #{time} where " +
            "id = #{id}")
    int update(Message message);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into message(title, content, time) values(#{title},#{content},#{time})")
    int add(Message message);
}
