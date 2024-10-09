package com.unjt.practice.mysyncdisk.service;


import com.unjt.practice.mysyncdisk.entity.PaperManage;

import java.util.List;

public interface PaperService {

    List<PaperManage> findAll();

    List<PaperManage> findById(Integer paperId);

    int add(PaperManage paperManage);
}
