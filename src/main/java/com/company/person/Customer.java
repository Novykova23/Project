package com.company.person;

public final class Customer extends Person {
    public String mobileNumber;
    public String orderNumber;

    public Customer(String mobileNumber, String orderNumber) {
        this.mobileNumber = mobileNumber;
        this.orderNumber = orderNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void makeOrders (){
        System.out.println("Make me 10 photos tomorrow");
    }
    public void callToAdmin (){System.out.println("How many time i wii wait?");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }
}

