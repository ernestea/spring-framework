package com.codefoe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.codefoe")
@ComponentScan(basePackages = {
        "com.codefoe.model",
        "com.codefoe.service",
        "com.codefoe.proxy",
        "com.codefoe.repository"
})
public class ProjectConfig {
}
