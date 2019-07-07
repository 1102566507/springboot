package com.wing.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.testpackage.componentScan")
public class ComponentScanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ComponentScanMain.class);
        String[] defNames=applicationContext.getBeanDefinitionNames();
        for(int i=0;i<defNames.length;i++){
            System.out.println(defNames[i]);
        }

    }
}
