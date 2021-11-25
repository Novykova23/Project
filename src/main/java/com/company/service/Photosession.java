package com.company.service;

import com.company.person.Photographer;

import java.util.List;
import java.util.Objects;

public final class Photosession{
    private final int amountOfPhotos;
    private final List customerList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photosession that = (Photosession) o;
        return amountOfPhotos == that.amountOfPhotos && cost == that.cost && Objects.equals(customerList, that.customerList) && Objects.equals(photographer, that.photographer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPhotos, customerList, cost, photographer);
    }

    private final int cost;

    public int getAmountOfPhotos() {
        return amountOfPhotos;
    }

    public List getCustomerList() {
        return customerList;
    }

    public int getCost() {
        return cost;
    }

    public Photographer getPhotographer() {
        return photographer;
    }

    private final Photographer photographer;

    public Photosession(int amountOfPhotos, List customerList, int cost, Photographer photographer) {
        assert amountOfPhotos > 0 : "the photographer should take at least one photo";

        this.amountOfPhotos = amountOfPhotos;
        this.customerList = customerList;
        this.cost = cost;
        this.photographer = photographer;
    }

    @Override
    public String toString() {
        return "Photosession{" +
                ", amountOfPhotos=" + amountOfPhotos +
                ", customerList=" + customerList +
                ", cost=" + cost +
                ", photographer=" + photographer +
                '}';
    }
}
