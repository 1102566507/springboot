package com.wing.annotation.ImportConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportConfigurationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new
                AnnotationConfigApplicationContext(SpringConfig.class);

        String[] defNames=applicationContext.getBeanDefinitionNames();
        for(int i=0;i<defNames.length;i++){
            System.out.println(defNames[i]);
        }
    }
}
