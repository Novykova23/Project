package com.company.money;
public enum Currency {
    USD("Dollar", "Dollars"),
    UAH("Hryvna", "Hryvnias"),
    EUR("Euro", "Euro");
    private String text;
    private String nText;

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

    public void setText(String text) {
        this.text = text;
    }

    public void setnText(String nText) {
        this.nText = nText;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "text='" + text + '\'' +
                ", nText='" + nText + '\'' +
                '}';
    }
}
