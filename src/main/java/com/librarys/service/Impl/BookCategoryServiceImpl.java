package com.librarys.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.librarys.dao.BookCategoryDao;
import com.librarys.entity.BookCategory;
import com.librarys.service.BookCategoryService;
import org.springframework.stereotype.Service;

@Service
public class BookCategoryServiceImpl extends ServiceImpl<BookCategoryDao, BookCategory> implements BookCategoryService {
}
