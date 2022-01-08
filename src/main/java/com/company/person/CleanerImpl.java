package com.company.person;

import com.company.interfaces.Cleaner;

public class CleanerImpl extends Person implements Cleaner {
    public int vaccuumCleaner;
    public int washingMachine;

    public CleanerImpl(String givenName, String familyName, int vaccuumCleaner, int washingMachine) {
        super(givenName, familyName);
        this.vaccuumCleaner = vaccuumCleaner;
        this.washingMachine = washingMachine;
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


    public void clean() {

    }

    public void washTowels() {

    }

    public void waterPots() {

    }

    @Override
    public String toString() {
        return "CleanerImpl{" +
                ", vaccuumCleaner=" + vaccuumCleaner +
                ", washingMachine=" + washingMachine +
                '}';
    }
}


