package com.company.person;
public class Photographer extends Person {
    private String familyName;
    private String givenName;


    public Photographer(String givenName, String familyName) {
        super(givenName);
        this.familyName = familyName;
    }

    public String getGivenName() {
        return super.getGivenName();
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return super.getFamilyName();
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Photographer{" +
                "familyName='" + familyName + '\'' +
                ", givenName='" + givenName + '\'' +
                '}';
    }
}
