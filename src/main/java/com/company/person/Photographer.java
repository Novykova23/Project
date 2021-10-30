package com.company.person;

public final class Photographer extends Person {
    public Photographer(String givenName, String familyName) {
        super(givenName);
    }

    public String getGivenName() {
        return super.getGivenName();
    }

    public String getFamilyName() {
        return super.getFamilyName();
    }

    public int hash(int amount, int currency) {
        return 0;
    }

    public long getAge() {
        return super.getAge();
    }
}
