package com.company.adress;

public final class Studio {
    ;
    private final String name;
    private final Adress adress;
    private final StudioType studioType;

    public Studio(String name, Adress adress, StudioType type) {
        this.name = name;
        this.adress = adress;
        this.studioType = type;
    }

        @Override
        public String toString() {
            return "Studio{" +
                    ", name='" + name + '\'' +
                    ", adress=" + adress +
                    ", studioType=" + studioType + "}";
        }
}



