package com.company.address;

public enum StudioType {
    PHOTO, VIDEO, GAME;

    StudioType() {
    }

    public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) {
        return Enum.valueOf(enumType, name);
    }


    @Override
    public String toString() {
        return "StudioType{}";
    }
}
