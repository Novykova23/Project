package com.company.person;

public abstract class Person{
    private String givenName;
    private String familyName;

    protected Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public Person(String givenName) {
    }

    protected Person() {
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + givenName + '\'' +
                "family name='" + familyName + '\''+
                '}';
    }

    public void makeVideo() {

    }
}

