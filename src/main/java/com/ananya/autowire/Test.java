package com.ananya.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext appli=new ClassPathXmlApplicationContext("autoconfig.xml");
        Employe emp1 = appli.getBean("emp1",Employe.class);
        System.out.println(emp1);
    }
}
