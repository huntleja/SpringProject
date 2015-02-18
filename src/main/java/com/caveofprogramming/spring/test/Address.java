package com.caveofprogramming.spring.test;

/**
 * Created by John on 2/17/2015.
 */
public class Address {
    private String street;
    private String zipcode;

    public Address() {

    }

    public Address(String street, String zipcode) {
        this.street = street;
        this.zipcode = zipcode;
    }

    public void init() {
        System.out.println("Bean created:" + this);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
