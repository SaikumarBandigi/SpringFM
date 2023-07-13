package com.javatpoint;


public class Raju {

    private Sonu sonu;


    public Sonu getSonu() {
        return sonu;
    }

    public void setSonu(Sonu sonu) {
        this.sonu = sonu;
    }

    private Prashu prashu;

    public Prashu getPrashu() {
        return prashu;
    }

    public void setPrashu(Prashu prashu) {
        this.prashu = prashu;
    }

    public void raju() {
        System.out.println("raju");
        sonu.sonu();
    }

}
