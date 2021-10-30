package com.company.person;

public class AdminFirst extends Person{
    protected AdminFirst(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public interface Admin {
    default void acceptOrders() {

    }
}

}

