package com.company.person;

import com.company.interfaces.Cleaner;

public class CleanerImpl extends Person implements Cleaner {
    protected CleanerImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public CleanerImpl(String givenName) {
        super(givenName);
    }

    @Override
    public void clean() {

    }
}
