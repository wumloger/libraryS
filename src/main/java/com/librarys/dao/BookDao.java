package com.librarys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.librarys.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
