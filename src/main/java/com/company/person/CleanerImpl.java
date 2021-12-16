package com.company.person;

import com.company.interfaces.Cleaner;

public class CleanerImpl extends Person implements Cleaner {
    public int vaccuumCleaner;
    public int washingMachine;

    public CleanerImpl(int vaccuumCleaner, int washingMachine) {
        this.vaccuumCleaner = vaccuumCleaner;
        this.washingMachine = washingMachine;
    }

    public void clean() {

    }

    public void washTowels() {

    }

    public void waterPots() {

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
                ", vaccuumCleaner=" + vaccuumCleaner +
                ", washingMachine=" + washingMachine +
                '}';
    }
}


