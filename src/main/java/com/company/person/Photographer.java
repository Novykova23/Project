package com.company.person;
public final class Photographer extends Person {
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


    public long getAge() {
        return super.getAge();
    }
}
