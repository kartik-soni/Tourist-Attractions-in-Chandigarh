package com.example.kartik.tourguide;

public class Info {

    private String name;
    private String address;
    private int imageId;

    public Info(String place, String place_address, int ImageResourceId) {
        name = place;
        address = place_address;
        imageId = ImageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getAddress() {
        return address;
    }

    public boolean checkImageSource() {
        return imageId != -1;
    }
}