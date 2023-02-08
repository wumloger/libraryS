package com.librarys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.librarys.dao.UserDao;
import com.librarys.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<User> {
}
