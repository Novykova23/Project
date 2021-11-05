package com.company.person;

import com.company.interfaces.Admin;

public class AdminImpl extends Person implements Admin {
    protected AdminImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }
    void acceptOrders() {

    }
}
