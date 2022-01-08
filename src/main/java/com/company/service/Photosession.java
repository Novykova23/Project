package com.company.service;

import com.company.person.Customer;
import com.company.person.Photographer;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
public final class Photosession {
    private int amountOfPhotos;
    private List<Customer> customerList;
    private Photographer photographer;
    private final int cost;


    public Photosession(int amountOfPhotos, List<Customer> customerList, Photographer photographer, int cost) {
        this.amountOfPhotos = amountOfPhotos;
        this.customerList = customerList;
        this.photographer = photographer;
        this.cost = cost;
    }

    public int getAmountOfPhotos() {
        return amountOfPhotos;
    }

    public void setAmountOfPhotos(int amountOfPhotos) {
        this.amountOfPhotos = amountOfPhotos;
    }

    public Photographer getPhotographer() {
        return photographer;
    }

    public void setPhotographer(Photographer photographer) {
        this.photographer = photographer;
    }

    public int getCost() {
        return cost;
    }


    public List getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List customerList) {
        this.customerList = customerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photosession that = (Photosession) o;
        return amountOfPhotos == that.amountOfPhotos && cost == that.cost && Objects.equals(customerList, that.customerList) && Objects.equals(photographer, that.photographer);
    }

    @Override
    public int hashCode() {
        final int hash = Objects.hash(amountOfPhotos, customerList, cost, photographer);
        return hash;
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
