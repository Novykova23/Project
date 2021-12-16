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

    @Override
    public String toString() {
        return "Customer{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }
}

