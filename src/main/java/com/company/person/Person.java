package com.company.person;

public abstract class Person{
    private String givenName;
    private String familyName;

    protected Person(String givenName, String familyName) {
        this.givenName = givenName;
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

