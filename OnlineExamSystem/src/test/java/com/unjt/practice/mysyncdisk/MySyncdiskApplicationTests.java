package com.unjt.practice.mysyncdisk;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.Admin;
import com.unjt.practice.mysyncdisk.entity.ExamManage;
import com.unjt.practice.mysyncdisk.mapper.AdminMapper;
import com.unjt.practice.mysyncdisk.service.impl.ExamManageServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MySyncdiskApplicationTests {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    private ExamManageServiceImpl examManageService;

    @Test
    void contextLoads() {
        List<Admin> adminList = adminMapper.findAll();
        System.out.println(adminList);
    }

    @Test
    public void findAllExam() {
        Page<ExamManage> all = examManageService.findAll(new Page<ExamManage>(1, 4));
        System.out.println(all.getRecords());
    }

}
