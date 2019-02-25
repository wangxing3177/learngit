package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IntroduceEntity introduceEntity = context.getBean("IntroduceEntity", IntroduceEntity.class);
        introduceEntity.setAge("100");
        introduceEntity.introduce();
    }
}
