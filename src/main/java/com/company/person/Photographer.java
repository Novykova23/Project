package com.company.person;
public class Photographer extends Person {
    private String camera;
    private String laptop;

    public Photographer(String camera, String laptop) {
        this.camera = camera;
        this.laptop = laptop;
    }


    public String getCamera() {
        return String.valueOf(camera);
    }

    public void setCamera(String camera) {
        this.camera = String.valueOf(Integer.parseInt(camera));
    }

    public String getLaptop() {
        return String.valueOf(laptop);
    }

    public void setLaptop(String laptop) {
        this.laptop = String.valueOf(Integer.parseInt(laptop));
    }

    @Override
    public String toString() {
        return "Photographer{" +
                "camera='" + camera + '\'' +
                ", laptop='" + laptop + '\'' +
                '}';
    }
}