package com.company.person;
public class Photographer extends Person {
    private String camera;
    private String laptop;

    public Photographer(String givenName, String familyName) {
        super(givenName, familyName);
        this.camera = camera;
        this.laptop = laptop;
    }


    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Photographer{" +
                "camera='" + camera + '\'' +
                ", laptop='" + laptop + '\'' +
                '}';
    }
}