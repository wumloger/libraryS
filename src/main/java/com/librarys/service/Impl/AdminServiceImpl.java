package com.librarys.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.librarys.dao.AdminDao;
import com.librarys.entity.Admin;
import com.librarys.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminService {
}
