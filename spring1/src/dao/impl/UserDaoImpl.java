package dao.impl;

import dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    @Override
    public void getUser() {
        // 查询数据
        System.out.println("查询数据库mysql！");
    }
}
