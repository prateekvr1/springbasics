package com.example.TypeOfDI;

public class AudiEngine implements Engine {
    String company;
    double cost;
    String type;


    int chasis;
    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String imporOrigin() {
        return "GERMANY";
    }

    @Override
    public int ChasisNo() {
        return chasis ;
    }
    @Override
    public String toString()
    {
        return "This is Engine object from: "
                + company+" "+chasis+" "+type+" "+cost;
    }
}
