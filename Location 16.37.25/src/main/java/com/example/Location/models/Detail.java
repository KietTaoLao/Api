package com.example.Location.models;

import com.example.Location.models.models_view.DetailView;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdDetail;
    Integer Rooms;
    Integer Bedrooms;
    Integer Bathrooms;


    public Detail(){}

    Long LocationId;


    public Detail(Long idDetail, Integer rooms, Integer bedrooms, Integer bathrooms, Long locationId) {
        IdDetail = idDetail;
        Rooms = rooms;
        Bedrooms = bedrooms;
        Bathrooms = bathrooms;
        LocationId = locationId;
    }
    public Detail(DetailView detailView){
        IdDetail = detailView.getIdDetail();
        Rooms = detailView.getRooms();
        Bedrooms = detailView.getBedrooms();
        Bathrooms = detailView.getBathrooms();
        LocationId = detailView.getLocationId();
    }

    public Long getIdDetail() {
        return IdDetail;
    }

    public void setIdDetail(Long idDetail) {
        IdDetail = idDetail;
    }

    public Integer getRooms() {
        return Rooms;
    }

    public void setRooms(Integer rooms) {
        Rooms = rooms;
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

    public Long getLocationId() {
        return LocationId;
    }

    public void setLocationId(Long locationId) {
        LocationId = locationId;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Detail{" +
                "Id= " + IdDetail +
                ",Rooms= " + Rooms +
                ",Bedrooms= " + Bedrooms +
                ",Bathrooms=  " + Bathrooms +
               ",LocationId=  " + LocationId +
                "}";
    }





}
