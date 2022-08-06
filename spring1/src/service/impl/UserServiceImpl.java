package service.impl;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import service.IUserService;

public class UserServiceImpl implements IUserService  {
/*
* 调用数据访问层
* */
    IUserDao dao;

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void getUser() {
        dao.getUser();
    }
}
