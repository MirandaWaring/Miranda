package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;
import service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
//        加载spring上下文 加载IOC容器
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring.xml");

        IUserService service = IOC.getBean(IUserService.class);
        service.getUser();
    }
}
