package com.example.Location.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Detail {
    @Id
    Long IdDetail;
    Integer Rooms;
    Integer Bedrooms;
    Integer Bathrooms;
    String Image;

    public Detail(){}

    public Detail(Integer rooms, Integer bedrooms, Integer bathrooms, String image) {
        Rooms = rooms;
        Bedrooms = bedrooms;
        Bathrooms = bathrooms;
        Image = image;
    }

    public Integer getRooms() {
        return Rooms;
    }

    public void setRooms(Integer rooms) {
        Rooms = rooms;
    }


    public Long getIdDetail() {
        return IdDetail;
    }
    public void setIdDetail(Long idDetail) {
        IdDetail = idDetail;
    }
    public Integer getBedrooms() {
        return Bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        Bedrooms = bedrooms;
    }




    public Integer getBathrooms() {
        return Bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        Bathrooms = bathrooms;
    }



    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Detail{" +
                "Id= " + IdDetail +
                ",Rooms= " + Rooms +
                ",Bedrooms= " + Bedrooms +
                ",Bathrooms=  " + Bathrooms +
                ",Image=  " + Image +
                "}";
    }





}
