package com.company.person;

import com.company.interfaces.Admin;

public class AdminImpl extends Person implements Admin {
    public int salary;
    public int workplace;

    public AdminImpl(String givenName, String familyName, int salary, int workplace) {
        super(givenName, familyName);
        this.salary = salary;
        this.workplace = workplace;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkplace() {
        return workplace;
    }

    public void setWorkplace(int workplace) {
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


    @Override
    public String toString() {
        return "AdminImpl{" +
                "salary=" + salary +
                ", workplace=" + workplace +
                '}';
    }
}
