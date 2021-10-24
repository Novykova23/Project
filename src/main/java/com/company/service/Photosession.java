package com.company.service;

import com.company.money.Money;
import com.company.person.Customer;
import com.company.person.Photographer;

public final class PhotoSession{
    private final int amountOfPhotos;
    private final int customerList;
    private final Money cost;
    private final Photographer photographer;
    private Money Objects;

    public PhotoSession(int amountOfPhotos, int customerList, Money cost, Photographer photographer) {
        assert amountOfPhotos > 0 : "the photographer should take at least one photo";
        assert cost.amount() != 0 : "customers should pay for photos";

        this.amountOfPhotos = amountOfPhotos;
        this.customerList = customerList;
        this.cost = cost;
        this.photographer = photographer;
    }

    public int getAmountOfPhotos() {
        return amountOfPhotos;
    }

    public int getCustomerList() {
        return customerList;
    }

    public Money getCost() {
        return cost;
    }

    public Photographer getPhotographer() {
        return photographer;
    }


    @Override
    public String toString() {
        return "PhotoSession{" +
                ", amountOfPhotos=" + amountOfPhotos +
                ", customerList=" + customerList +
                ", cost=" + cost +
                ", photographer=" + photographer +
                '}';
    }
}
