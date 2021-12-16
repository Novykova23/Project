package com.company.person;

public class Owner extends Person {
    public String income;
    public String property;
    public String workers;

    public Owner(String income, String property, String workers) {
        this.income = income;
        this.property = property;
        this.workers = workers;
    }

    public Owner(String john, String doe) {

    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getWorkers() {
        return workers;
    }

    public void setWorkers(String workers) {
        this.workers = workers;
    }

    public int hash(int amount, int currency) {
        return 0;
    }

    public Owner(String john, String doe, String familyName, String givenName) {
        super(givenName, familyName);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "income='" + income + '\'' +
                ", property='" + property + '\'' +
                ", workers='" + workers + '\'' +
                '}';
    }
}

