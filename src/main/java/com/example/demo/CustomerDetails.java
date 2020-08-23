package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
    private String CustomerName;
    private int CustId;
    @Autowired
    private Address address;
    public void setAddress(Address address) {
        this.address = address;
    }



    public Address getAddress() {
        return address;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }


    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public void dispaly()
    {System.out.println("Here DI Works");
    address.tech();}
}
