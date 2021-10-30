package com.company.service;

public final class Photosession{
    private final int amountOfPhotos;
    private final int customerList;
    private final int cost;
    private final int photographer;

    public Photosession(int amountOfPhotos, int customerList, int cost, int photographer) {
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
