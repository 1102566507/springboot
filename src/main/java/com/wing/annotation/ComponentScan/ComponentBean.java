package com.wing.annotation.ComponentScan;

//希望这个类被spring 托管

import org.springframework.stereotype.Service;

/**
 * <bean name="" class="com.gupaoedu.springboot.springbootfirst.fristDemo.Democlass"/>
 * javaconfig
 * autoconfiguration  (简化我们bean的注入逻辑）
 */
@Service
public class ComponentBean {

    public void say(){
        System.out.println("Say: Hello Mic");
    }
}


