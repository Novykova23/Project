package com.company.person;

public final class Customer extends Person {
    private static String givenName;

    public Customer() {
        super(givenName);
    }

    public Customer(String mr, String proper) {
        this();
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
    public long getAge() {
        return super.getAge();
    }
}

