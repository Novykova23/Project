package com.company.person;

public final class Photographer extends Person {
    private String familyName;

    public Photographer(String givenName, String familyName) {
        super(givenName);
        this.familyName = familyName;
    }

    public String getGivenName() {
        return super.getGivenName();
    }

    public String getFamilyName() {
        return super.getFamilyName();
    }

    public long getAge() {
        return super.getAge();
    }
}
