package com.unjt.practice.mysyncdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Message;

public interface MessageService {
    Page<Message> findAll(Page page);

    Message findById(Integer id);

    int delete(Integer id);

    int update(Message message);

    int add(Message message);
}
