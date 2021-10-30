package com.company.person;

public class VideoMaker extends Person{
    protected VideoMaker(String givenName, String familyName) {
        super(givenName, familyName);
    }
    public interface Videograph{
        void makeVideo();
    }
}
