package com.company.person;

import com.company.interfaces.Cleaner;

public class CleanerImpl extends Person implements Cleaner {
    private String givenName;
    private String familyName;
    public int vaccuumCleaner;
    public int washingMachine;

    public CleanerImpl(String givenName, String familyName, int vaccuumCleaner, int washingMachine) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.vaccuumCleaner = vaccuumCleaner;
        this.washingMachine = washingMachine;
    }

    public void clean() {

    }

    public void washTowels() {

    }

    public void waterPots() {

    }

    @Override
    public String getGivenName() {
        return givenName;
    }

    @Override
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public String getFamilyName() {
        return familyName;
    }

    @Override
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getVaccuumCleaner() {
        return vaccuumCleaner;
    }

    public void setVaccuumCleaner(int vaccuumCleaner) {
        this.vaccuumCleaner = vaccuumCleaner;
    }

    public int getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(int washingMachine) {
        this.washingMachine = washingMachine;
    }

    @Override
    public String toString() {
        return "CleanerImpl{" +
                "givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", vaccuumCleaner=" + vaccuumCleaner +
                ", washingMachine=" + washingMachine +
                '}';
    }
}


