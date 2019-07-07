package com.wing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
class Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext ca=
                SpringApplication.run(Application.class, args);

        String[] beanDefs=ca.getBeanDefinitionNames();
        for(String str:beanDefs){
            System.out.println(str);
        }
    }


}
