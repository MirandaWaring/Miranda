package dao.impl;

import dao.IUserDao;

public class UserDaoOracleImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.printf("查询Oracle数据库！");
    }
}
