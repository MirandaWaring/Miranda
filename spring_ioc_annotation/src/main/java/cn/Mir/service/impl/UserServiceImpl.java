package cn.Mir.service.impl;

import cn.Mir.dao.UserDao;
import cn.Mir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service    //UserServiceImpl
//@Primary    //设置自动注入的主要Bean
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void getUser() {
        System.out.println("UserServiceImpl输出");
        userDao.getUser();
    }
}
