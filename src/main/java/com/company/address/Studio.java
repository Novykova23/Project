package com.company.address;

public class Studio {

    private String name;
    private Address address;
    private StudioType studioType;

    public Studio(String name, Address address, StudioType studioType) {
        this.name = name;
        this.address = address;
        this.studioType = studioType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public StudioType getStudioType() {
        return studioType;
    }

    public void setStudioType(StudioType studioType) {
        this.studioType = studioType;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", studioType=" + studioType +
                '}';
    }
}



