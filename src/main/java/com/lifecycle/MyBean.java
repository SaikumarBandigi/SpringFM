package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class MyBean implements DisposableBean, InitializingBean {

    // Bean properties and methods go here

    @Override
    public void destroy() throws Exception {
        // Cleanup or resource releasing logic goes here
        System.out.println("Destroying MyBean...");

        // Release any resources held by the bean
        // ...
    }

    public void doSomething() {
        // Method logic goes here
        System.out.println("MyBean is doing something.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing MyBean..");
    }
}