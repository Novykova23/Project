package com.company.person;

import com.company.interfaces.Videograph;

public class VideographImpl extends Person implements Videograph {
    protected VideographImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    @Override
    public String getFamilyName() {
        return null;
    }

    @Override
    public void makeVideo() {

    }
}
