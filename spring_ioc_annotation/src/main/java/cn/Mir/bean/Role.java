package cn.Mir.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@DependsOn("user")
//@Lazy ==lazy-init
//@Scope("prototype") //默认单例子 singleton   多例 prototype
public class Role {

    @Value("管理员")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
        System.out.println("Role 已加载！");
    }

//    生命周期回调-3 初始化回调
    @PostConstruct
    public void  init(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void  destory(){
    System.out.println("销毁");
    }
}
