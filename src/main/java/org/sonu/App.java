package org.sonu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Operation e = (Operation) context.getBean("opBean");
//
//        e.msg();
//
//        e.m();
//
//        e.k();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien = context.getBean(Alien.class);

        alien.show();
        alien.show1();
    }
}
