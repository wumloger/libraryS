package com.librarys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.librarys.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
