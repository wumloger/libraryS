package com.librarys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.librarys.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao extends BaseMapper<Admin> {
}
