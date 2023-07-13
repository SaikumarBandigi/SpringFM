package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BeanExample {

    private SomeClass b;

    public SomeClass getBean() {
        return b;
    }

    public void setBean(SomeClass b) {
        this.b = b;
    }

    public void bX() {
        System.out.println("hai bean..");
        b.disc();
    }
}
