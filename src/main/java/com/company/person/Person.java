package com.company.person;

import com.company.money.Currency;

public abstract class Person{
    private final String givenName;
    private final String familyName;

    protected Person(String givenName) {
        this(givenName, );
    }

    protected Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public Person(String givenName, String familyName) {
        this.givenName = givenName;

        this.familyName = familyName;
    }


    protected String getGivenName() {
        return givenName;
    }

    protected String getFamilyName() {
        return familyName;
    }
    

    public long getAge() {
        return 0;
    }

    protected String getId() {
    }

    public abstract int hash(int amount, Currency currency);
}

