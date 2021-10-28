package com.company.person;

import com.company.money.Currency;

import java.util.Objects;

public final class Owner extends Person {

    private Objects Objects;
    private Objects studios;

    public Owner(String givenName, String familyName, String dateOfBirth) {
        super(givenName);
    }

    @Override
    public int hash(int amount, Currency currency) {
        return 0;
    }

    public Owner(String john, String doe) {
        super(givenName);
    }

    public Objects getStudios() {
        return studios;
    }

    public void assignStudio(Studio studio) {
        Objects.requireNonNull(studio);

    }

    public void assignStudio(Studio... studio) {
        if (studio == null || studio.length == 0) {
            return;
        }

    }

    @Override
    public String toString() {
        return "Owner{" +
                "studios=" + studios +
                '}';
    }

    public boolean equals(Object o, Currency currency) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(studios, owner.studios);
    }

    @Override
    public int hashCode() {
        final var hash = Objects.hash(studios);
        return hash;
    }

    public void assignStudio(com.company.adress.Studio lensQueenStudio) {
    }

    private class Studio{
        public void setOwner(Owner owner) {
        }
    }
}

