package com.company.money;

import java.util.Objects;

final class Money {
    private int amount;
    private int currency;

    public Money(int amount, int currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Money money = (Money) o;
            return amount == money.amount && currency == money.currency;
        }

        @Override
        public int hashCode () {
            return Objects.hash(amount, currency);
        }


        @Override
        public String toString () {
            return "Money{" +
                    "amount=" + amount +
                    ", currency=" + currency +
                    '}';
        }
    }

