package com.unjt.practice.mysyncdisk.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Message;
import com.unjt.practice.mysyncdisk.mapper.MessageMapper;
import com.unjt.practice.mysyncdisk.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public Page<Message> findAll(Page page) {
        List<Message> messageList = messageMapper.findAll((page.getCurrent() - 1) * page.getSize(), page.getSize());
        Page<Message> messagePage = new Page<>(page.getCurrent(), page.getSize());
        messagePage.setTotal(messageList.size());
        messagePage.setRecords(messageList);
        return messagePage;
    }

    @Override
    public Message findById(Integer id) {
        return messageMapper.findById(id);
    }

    @Override
    public int delete(Integer id) {
        return messageMapper.delete(id);
    }

    @Override
    public int update(Message message) {
        return messageMapper.update(message);
    }

    @Override
    public int add(Message message) {
        return messageMapper.add(message);
    }
}
