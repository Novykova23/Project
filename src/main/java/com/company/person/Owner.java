package com.company.person;

public class Owner extends Person {
    public Owner() {
    }

    public Owner(String familyName, String givenName) {
        super(givenName);
    }

    public Owner(String givenName) {
        super(givenName);
    }

    public int hash(int amount, int currency) {
        return 0;
    }

    public Owner(String john, String doe, String familyName, String givenName) {
        super(givenName, familyName);
    }

}

