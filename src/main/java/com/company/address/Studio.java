package com.company.address;

public class Studio {

    private String name;
    private Address address;
    private StudioType studioType;

    public Studio(String name, Address address, StudioType type) {
        this.name = name;
        this.address = address;
        this.studioType = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setStudioType(StudioType studioType) {
        this.studioType = studioType;
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
                    ", studioType=" + studioType + "}";
        }
}



