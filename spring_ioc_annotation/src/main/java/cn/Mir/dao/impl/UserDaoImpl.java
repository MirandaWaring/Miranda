package cn.Mir.dao.impl;

import cn.Mir.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("查询数据库！");
    }
}
