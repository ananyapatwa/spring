package com.ananya.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FetchStudent {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student) context.getBean("Student1");
        System.out.println("This is my student");
        System.out.println(student1);
    }
}
