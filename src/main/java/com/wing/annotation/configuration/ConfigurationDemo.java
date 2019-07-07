package com.wing.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationDemo {

    @Bean
    public ComfigurationBean defaultBean(){
        return new ComfigurationBean();
    }

}
