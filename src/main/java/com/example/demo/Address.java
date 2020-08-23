package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int HouseNo;
    private String Street;
    private String city;

    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int houseNo) {
        HouseNo = houseNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void tech(){
        System.out.println("Successfull");
    }
}
