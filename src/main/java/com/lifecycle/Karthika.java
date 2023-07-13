package com.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "k")
@Scope(value = "prototype")
public class Karthika  {

    private String name;

    public Karthika() {
        System.out.println("contructor called..");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter method called..");
    }

    public void init() {
        System.out.println("init method..");
    }

    public void kar() {
        System.out.println("kar method called..");
    }

    public void destroy() {
        System.out.println("destroy method called..");
    }


}