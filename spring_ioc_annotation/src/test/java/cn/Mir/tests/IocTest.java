package cn.Mir.tests;

import cn.Mir.Controller.UserController;
import cn.Mir.bean.Role;
import cn.Mir.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    ClassPathXmlApplicationContext ioc;
    @Before
    public void Before(){
        ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
    }

    @Test
    public void test01(){
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);
    }

    @Test
    public void test02(){
        User bean = ioc.getBean(User.class);
        System.out.println(bean.getName());
    }

    @Test
    public void test03(){
        UserController bean = ioc.getBean(UserController.class);
        bean.getUser();
    }

    @Test
    public void test04(){
        Role bean = ioc.getBean(Role.class);
        Role bean2 = ioc.getBean(Role.class);
        Role bean3 = ioc.getBean(Role.class);

    }

    @Test
    public void test05(){
        Role bean = ioc.getBean(Role.class);
        ioc.close();
    }
}
