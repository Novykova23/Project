package com.company.money;

public final class Money{
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

    public static Money eur(int amount) {
        return null;
    }

    public static void uah(int amount) {

    }


}

