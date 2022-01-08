package com.company.person;
public class Photographer extends Person {
    private String camera;
    private String laptop;

    public Photographer(String givenName, String familyName, String camera, String laptop) {
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

    public void makePhotos (){
        System.out.println("I can make best your pictures!");
    }
    public void retouchPhotos(){System.out.println("You will be beatifull in my photos!");
    }

    @Override
    public String toString() {
        return "Photographer{" +
                "camera='" + camera + '\'' +
                ", laptop='" + laptop + '\'' +
                '}';
    }
}