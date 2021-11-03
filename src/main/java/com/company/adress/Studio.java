package com.company.adress;

public final class Studio {
    ;
    private final String name;
    private final String adress;
    private final String studioType;

    public Studio(String name, String adress, String type) {
        this.name = name;
        this.adress = adress;
        this.studioType = type;
    }

    public Studio(String lens_queen, Adress adress, StudioType photo) {



    @Override
    public String toString() {
        return "Studio{" +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", studioType=" + studioType + "}";
    }

}


