package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

   private Address address;

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
