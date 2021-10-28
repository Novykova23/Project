package com.company.person;

import com.company.money.Currency;

public abstract class Person{
    private String givenName;
    private String familyName;

    protected Person(String givenName, String givenName1, String familyName) {
        this(givenName); this.givenName = givenName;
        this.givenName = givenName1;
        this.familyName = familyName;
    }


    public Person(String givenName) {
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
    };
}

