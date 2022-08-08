package cn.Mir.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
//    使用value注解设置依赖注入
//    1.除了可以写硬编码值
//    2.还可写${}->获取外部资源文件值、#{}->s    pel表达式

//    @Value("#{role.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User  已加载！");
    }
}
