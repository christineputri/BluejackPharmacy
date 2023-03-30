package com.example.mcsasg;

public class Medicine {
    int image;
    String name;
    String manufacturer;
    String price;

    public Medicine(int image, String name, String manufacturer,String price) {
        this.image = image;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static void add(Medicine medicine) {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}