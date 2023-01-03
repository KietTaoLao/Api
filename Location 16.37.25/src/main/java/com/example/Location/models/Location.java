package com.example.Location.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Location {
    //this is "primary key"
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LocationId;
    private String Address;
    private String Wards;
    private String City;

    public  Location(){}

    public Location(Long locationId, String address, String wards, String city) {
        this.LocationId = locationId;
        Address = address;
        Wards = wards;
        City = city;
    }

    public Long getId() {
        return LocationId;
    }

    public void setId(Long id) {
        this.LocationId = id;
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




    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Location{" +
                "LocationsId= " + LocationId +
                ",Address= " + Address +
                ",Wards= " + Wards +
                ",City=  " + City +
                "}";
    }
}
