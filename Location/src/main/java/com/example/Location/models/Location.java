package com.example.Location.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
    //this is "primary key"
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Address;
    private String Wards;
    private String City;

    public  Location(){}

    public Location(String address, String wards, String city) {
       Address = address;
       Wards = wards;
       City = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getWards() {
        return Wards;
    }

    public void setWards(String wards) {
        Wards = wards;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Admin{" +
                "id= " + Id +
                ",Address= " + Address +
                ",Wards= " + Wards +
                ",City=  " + City +
                "}";
    }
}
