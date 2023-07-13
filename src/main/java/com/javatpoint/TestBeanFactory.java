package com.javatpoint;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

import java.util.*;

public class TestBeanFactory {
    public static void main(String[] args) {

//        Resource r = new ClassPathResource("applicationContext.xml");
//
//        BeanFactory factory = new XmlBeanFactory(r);


//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//
//        BeanExample b = (BeanExample) context.getBean(BeanExample.class);
//        b.bX();


//        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
//
//        List<Employee> list=dao.getAllEmployees();
//
//        for(Employee e:list)
//            System.out.println(e);


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Raju raju=(Raju) context.getBean("r");
        raju.raju();

    }
}
