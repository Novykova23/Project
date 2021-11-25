package com.company.person;

import com.company.interfaces.Assistant;

public class AssistantImpl extends Person implements Assistant {
    protected AssistantImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public AssistantImpl(String givenName) {
        super(givenName);
    }

    @Override
    public void help() {

    }
}
