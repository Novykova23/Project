package com.company.person;

public class Admin extends Person{
    protected Admin(String givenName, String givenName1, String familyName) {
        super(givenName, givenName1, familyName);
    }

    public interface Admin {
    default void acceptOrders() {

    }
}

}

