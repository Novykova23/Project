package com.company.person;

public class CleanerStudio extends Person{
    protected CleanerStudio(String givenName, String familyName) {
        super(givenName, familyName);
    }
    public interface Cleaner{
        void clean();
    }
}
