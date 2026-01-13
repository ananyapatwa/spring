package com.ananya.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext appli=new ClassPathXmlApplicationContext("refconfig.xml");
        A temp=(A) appli.getBean("refa");
        System.out.println(temp.getX());
        System.out.println(temp.getOb());
    }
}
