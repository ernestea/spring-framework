package com.codefoe.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {

    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    Integer number() {
        return 200;
    }
}
