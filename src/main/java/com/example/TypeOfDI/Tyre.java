package com.example.TypeOfDI;

public class Tyre {


    String place;
    String name;
    String company;
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "This is Tyre object: "
                + name + " " + place
                + " " + company;
    }


}
