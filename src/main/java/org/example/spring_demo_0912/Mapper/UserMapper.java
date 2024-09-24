package org.example.spring_demo_0912.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.spring_demo_0912.Entry.UserInfo;

@Mapper
public interface UserMapper {
    @Select("select * from userinfo where id = #{id}")
    public UserInfo findById(int id);
}
