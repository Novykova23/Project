package com.company.person;

import com.company.interfaces.Videograph;

public class VideographImpl extends Person implements Videograph {
    public String videocamera;
    public String tripod;

    public VideographImpl(String givenName, String familyName, String videocamera, String tripod) {
        super(givenName, familyName);
        this.videocamera = videocamera;
        this.tripod = tripod;
    }

    public String getVideocamera() {
        return videocamera;
    }

    public void setVideocamera(String videocamera) {
        this.videocamera = videocamera;
    }

    public String getTripod() {
        return tripod;
    }

    public void setTripod(String tripod) {
        this.tripod = tripod;
    }

    public void makeWeddingFilm(){
        System.out.println("Shooting video as soon as possible");
    }

    @Override
    public void makeVideo() {

    }

    @Override
    public String toString() {
        return "VideographImpl{" +
                "videocamera='" + videocamera + '\'' +
                ", tripod='" + tripod + '\'' +
                '}';
    }
}
