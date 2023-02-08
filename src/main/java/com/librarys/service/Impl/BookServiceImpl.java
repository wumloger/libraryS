package com.librarys.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.librarys.dao.BookDao;
import com.librarys.entity.Book;
import com.librarys.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {
}
