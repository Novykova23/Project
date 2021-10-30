package com.company.adress;

public final class Studio { ;
    private final String name;
    private final String address;
    private final String studioType;

    public Studio(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.studioType = type;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
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
