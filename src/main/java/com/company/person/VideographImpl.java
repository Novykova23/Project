package com.company.person;

import com.company.interfaces.Videograph;

public class VideographImpl extends Person implements Videograph {
    protected VideographImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public VideographImpl(String givenName) {
        super(givenName);
    }

    @Override
    public String toString() {
        return "VideographImpl{}";
    }

    @Override
    public String getFamilyName() {
        return null;
    }

    @Override
    public void makeVideo() {

    }
}
