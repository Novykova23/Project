package com.company.person;

import com.company.interfaces.Admin;

public class AdminImpl extends Person implements Admin {
    protected AdminImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }
    public int salary;
    public int workplace;

    public AdminImpl (String givenName, String familyName, int salary, int workplace){
        this.salary = salary;
        this.workplace = workplace;
    }
    public void acceptOrders() {
    }
    public void getCalls(){
        System.out.println("Get calls in number 12-34-56");
    }
    public void sendMessages(){
        System.out.println("Send messages about offer status");
    }

}
