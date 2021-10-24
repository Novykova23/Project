package com.company.money;
public enum Currency {
    USD("Dollar", "Dollars"),
    UAH("Hryvna", "Hryvnias"),
    EUR("Euro", "Euro");
    private final String text;
    private final String nText;

    Currency(String text, String nText) {
        this.text = text;
        this.nText = nText;
    }

    public String getText() {
        return text;
    }

    public String getnText() {
        return nText;
    }
}
