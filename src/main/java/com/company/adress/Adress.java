package com.company.adress;

import java.util.Objects;

public final class Adress{
    private final String city;
    private final String street;
    private final String country;
    private final String postCode;

    public Adress(String city, String street, String country, String postCode) {
        this.city = city;
        this.street = street;
        this.country = country;
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(city, adress.city) && Objects.equals(street, adress.street) && Objects.equals(country, adress.country) && Objects.equals(postCode, adress.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, country, postCode);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", country='" + country + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}

