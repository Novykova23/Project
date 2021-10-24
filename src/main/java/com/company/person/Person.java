package com.company.person;

public abstract class Person implements IdAware<String> {
    private final String givenName;
    private final String familyName;
    private final String dateOfBirth;

    protected Person(String givenName, String familyName, String dateOfBirth) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
    }


    protected String getGivenName() {
        return givenName;
    }

    protected String getFamilyName() {
        return familyName;
    }

    protected String getDateOfBirth() {
        return dateOfBirth;
    }
    

    public long getAge() {
        return ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + getAge() +
                '}';
    }
}

