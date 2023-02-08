package com.librarys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.librarys.entity.BookCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookCategoryDao extends BaseMapper<BookCategory> {
}
