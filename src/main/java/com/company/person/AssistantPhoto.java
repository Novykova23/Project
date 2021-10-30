package com.company.person;
public class AssistantPhoto extends Person{

    protected AssistantPhoto(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public interface Assistant{
        void help();
    }

}
