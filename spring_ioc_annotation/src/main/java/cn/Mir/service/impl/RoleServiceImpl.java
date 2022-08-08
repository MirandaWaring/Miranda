package cn.Mir.service.impl;

import cn.Mir.dao.UserDao;
import cn.Mir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class RoleServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void getUser() {
        System.out.println("RoleServiceImpl输出");
        userDao.getUser();
    }
}
