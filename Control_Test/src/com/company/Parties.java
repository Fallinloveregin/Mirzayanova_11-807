package com.company;

public class Parties {

    private int data;
    private String place;
    private int price;
    private String name;

    public Parties(int data, String place, int price, String name) { //ееееее туса
        this.data = data;
        this.place = place;
        this.price = price;
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Вечериночки" + data + "числа," + "стоит" + price+ ", будет проходить в " + place + ", ну а название у вечеринки" + name ;
    }


}