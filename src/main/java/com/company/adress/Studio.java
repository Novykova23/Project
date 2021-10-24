package com.company.adress;

public final class Studio { ;
    private final String name;
    private final String address;
    private final String studioType;
    private String owner;
    private Adress adress;
    private Object String;

    public Studio(String name, Adress address, StudioType type) {
        this.name = name;
        this.address = address;
        this.studioType = type;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public java.lang.String getOwner() {
        return owner;
    }

    public String getStudioType() {
        return studioType;
    }



    @Override
    public String toString() {
        return "Studio{" +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", studioType=" + studioType +
                '}';
    }

}
