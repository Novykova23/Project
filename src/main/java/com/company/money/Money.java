package com.company.money;

import java.util.Objects;

final class Money{
    private final int amount;
    private final int currency;

    public Money(int amount, int currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public int amount() {
        return amount;
    }


    public static void usd(int amount) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    public static Money eur(int amount) {
        return null;
    }

    public static void uah(int amount) {

    }


    public int getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}

