package com.company.adress;

public final class Studio { ;
    private final String name;
    private final Address address;
    private final StudioType studioType;

    public Studio(String name, Address address, StudioType type) {
        this.name = name;
        this.address = address;
        this.studioType = type;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }


    public StudioType getStudioType() {
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
