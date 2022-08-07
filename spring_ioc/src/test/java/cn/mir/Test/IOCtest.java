package cn.mir.Test;

import cn.mir.Person;
import cn.mir.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCtest {
    ClassPathXmlApplicationContext ioc;
    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
    }
    @Test
    public void test01(){
//        获取bean的方式
//        1.通过类来获取  getBean(User.class)
//        2.通过bean的名字或者id来获取bean  （User）ioc.getBean("User")
//        3.通过名字+类型
        User bean = ioc.getBean("user",User.class);
        System.out.println(bean);
    }

    //通过别名来获取bean
    @Test
    public void test02(){
        User bean = ioc.getBean("user2",User.class);
        System.out.println(bean);
    }

//    基于setter（）方法的依赖注入  对应的set（）方法的名字
    @Test
    public void test03(){
        User bean = ioc.getBean("user6",User.class);
        System.out.println(bean);
    }

//    基于构造函数的注入
    @Test
    public void test04(){
        User bean = ioc.getBean("user7",User.class);
        System.out.println(bean);
    }

    //    基于复杂构造函数的注入
    @Test
    public void test05(){
        Person bean = ioc.getBean("person",Person.class);
        System.out.println(bean);
    }

    //    使用p命名空间简化基于setter属性注入xml配置
    @Test
    public void test06(){
        Person bean = ioc.getBean("person2",Person.class);
        System.out.println(bean);
    }

    //    使用c命名空间简化基于构造函数的注入xml配置
    @Test
    public void test07(){
        Person bean = ioc.getBean("person3",Person.class);
        System.out.println(bean);
    }
}
