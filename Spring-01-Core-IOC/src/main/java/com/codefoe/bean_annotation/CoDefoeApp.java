package com.codefoe.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CoDefoeApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class,SomeConfig.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

//        PartTimeMentor pt = container.getBean("p2", PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);//@Primary default
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);

    }
}
