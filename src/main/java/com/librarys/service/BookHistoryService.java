package com.librarys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.librarys.dao.BookHistoryDao;
import com.librarys.entity.BookHistory;
import org.springframework.stereotype.Service;

@Service
public interface BookHistoryService extends IService<BookHistory> {
}
