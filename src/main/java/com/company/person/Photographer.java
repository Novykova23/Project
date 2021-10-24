package com.company.person;

import com.company.money.Currency;

public final class Photographer extends Person {
    public Photographer(String givenName, String familyName) {
        super(givenName, familyName);
    }

    @Override
    public String getGivenName() {
        return super.getGivenName();
    }

    @Override
    public String getFamilyName() {
        return super.getFamilyName();
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public int hash(int amount, Currency currency) {
        return 0;
    }

    @Override
    public long getAge() {
        return super.getAge();
    }
}
