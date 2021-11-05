package com.company.person;

import com.company.interfaces.Cleaner;

public class CleanerImpl extends Person implements Cleaner {
    protected CleanerImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    @Override
    public void clean() {

    }
}
