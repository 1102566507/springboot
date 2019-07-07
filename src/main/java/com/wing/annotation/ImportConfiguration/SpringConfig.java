package com.wing.annotation.ImportConfiguration;

import com.wing.annotation.configuration.ConfigurationDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(ConfigurationDemo.class)
@Configuration
public class SpringConfig {

    @Bean
    public DefaultBean defaultBean(){
        return new DefaultBean();
    }
}
