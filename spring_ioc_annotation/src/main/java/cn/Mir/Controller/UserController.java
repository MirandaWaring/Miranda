package cn.Mir.Controller;

import cn.Mir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    /*
    * 使用Autowired来实现自动注入
    * bytype byname
    * 默认优先根据类型
    * 如果匹配到多个类型则会按照名字匹配
    * 如果名又没有匹配到则会报错
    *   1.修改属性的名字对应bean的名字（类名首字母小写）  userServiceImpl
    *   2.可以去修改Bean的名字对应属性的名字 @Service("userService")
    *   3.可以通过@Qualifier("XX")设置属性名(XX)【覆盖】
    *   4.可以通过@Primary 设置其中一个Bean为主要的自动注入Bean
    *   5.如果泛型作为自动注入限定符
    *
    * 一个公共的接口传递了一个不同的泛型 -》将接口设置为泛型： interface XX<T>
    * */

//    @Autowired
//    @Qualifier("userServiceImpl")
    @Resource
    UserService userServiceImpl;
    /*
    *@Resource与@Autowired区别
    * @Resource 依赖JDK  @Autowired依赖spring
    *  @Resource优先根据名字   @Autowired优先根据类型
    *  */

    /*
    * @Autowired也可写在构造器上
    * 默认优先根据参数类型去匹配
    * */
//    @Autowired
    public void createUserService(UserService userService) {
        this.userServiceImpl = userService;
    }

    public void getUser(){
        userServiceImpl.getUser();
    }
}
