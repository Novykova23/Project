package com.company.money;

import com.company.person.Owner;

public final class Money {
    private final int amount;
    private final Currency currency;
    private Owner Objects;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int amount() {
        return amount;
    }

    public Currency currency() {
        return currency;
    }

    public static Money usd(int amount) {
        return new Money(amount, Currency.USD);
    }

    public static Money eur(int amount) {
        return new Money(amount, Currency.EUR);
    }

    public static Money uah(int amount) {
        return new Money(amount, Currency.UAH);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Money) obj;
        return this.amount == that.amount &&
                Objects.equals(this.currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        final String currencyLabel = amount == 1 ? currency.getnText() : currency.getText();

        return String.format("%d %s", amount, currencyLabel);
    }

}

