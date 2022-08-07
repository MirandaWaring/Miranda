package cn.mir.Test;

import cn.mir.Person;
import cn.mir.User;
import cn.mir.Wife;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//Sprig IOC基于高级使用
public class IOCtestHigh {
    ClassPathXmlApplicationContext ioc;
    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring-ioc-high.xml");
    }

//    depends-on加载
    @Test
    public void test01(){
        System.out.println("spring 已加载!");
    }

//    懒加载
    @Test
    public void test02(){
        System.out.println("spring 已加载!");
      Wife wife = ioc.getBean("wife",Wife.class);
        System.out.println(wife);
    }

    //    作用域
    @Test
    public void test03(){
        System.out.println("spring 已加载!");
        Person person1 = ioc.getBean("person",Person.class);
        Person person2 = ioc.getBean("person",Person.class);
        System.out.println(person1);
    }

    //使用静态工厂来实例化
    @Test
    public void test04(){
        Person person = ioc.getBean("person",Person.class);
        System.out.println(person);
    }

    //使用实例工厂来实例化
    @Test
    public void test05(){
        Person person = ioc.getBean("person2",Person.class);
        System.out.println(person);
    }

    //自动注入
    // bytype
//    byname 根据名称 bean中 id

    @Test
    public void test06(){
        Person person = ioc.getBean("person2",Person.class);
        System.out.println(person);
    }

//    生命周期回调
//    1.使用接口的方式实现：
//      1)初始化回调   实现InitializingBean 重写afterPropertiesSet
//      2)销毁回调 实现DisposableBean 重写destroy
//    2.基于配置的方式实现

    @Test
    public void test07(){
        Person person = ioc.getBean("person2",Person.class);
        System.out.println(person);
       ioc.close();
    }

//    配置第三方bean
    @Test
    public void test08(){
        DruidDataSource datasource = ioc.getBean("dataSource", DruidDataSource.class);
        System.out.println(datasource);
        ioc.close();
    }
}
