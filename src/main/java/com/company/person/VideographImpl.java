package com.company.person;

import com.company.interfaces.Videograph;

public class VideographImpl extends Person implements Videograph {
    protected VideographImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public VideographImpl(String givenName) {
        super(givenName);
    }

    public void makeWeddingFilm(){
        System.out.println("Зйомка фільму в найкоротші терміни");
    }

}
