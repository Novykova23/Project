package com.company.service;

import com.company.person.Photographer;

import java.util.List;

public final class Photosession{
    private final int amountOfPhotos;
    private final List customerList;
    private final int cost;
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
