package com.company.person;

import com.company.money.Currency;

public final class Customer extends Person {
    public Customer(String givenName, String familyName) {
        super(givenName);
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
    public int hash(int amount, Currency currency) {
        return 0;
    }

    @Override
    public long getAge() {
        return super.getAge();
    }
}

