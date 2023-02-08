package com.librarys.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.librarys.dao.UserDao;
import com.librarys.entity.User;
import com.librarys.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService{

}
