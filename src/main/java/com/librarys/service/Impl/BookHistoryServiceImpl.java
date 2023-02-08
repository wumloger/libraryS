package com.librarys.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.librarys.dao.BookHistoryDao;
import com.librarys.entity.BookHistory;
import com.librarys.service.BookHistoryService;
import org.springframework.stereotype.Service;

@Service
public class BookHistoryServiceImpl extends ServiceImpl<BookHistoryDao, BookHistory> implements BookHistoryService {
}
