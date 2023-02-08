package com.librarys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.librarys.entity.BookHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookHistoryDao extends BaseMapper<BookHistory> {
}
