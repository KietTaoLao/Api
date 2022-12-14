
package com.example.Location.models.models_view;

import com.example.Location.models.Detail;

import java.util.List;

public class DetailView {

    Long IdDetail;
    Integer Rooms;
    Integer Bedrooms;
    Integer Bathrooms;
    List<String> Image;

    Long LocationId;

    public DetailView(Detail detail,List<String> images){
        setLocationId(detail.getLocationId());
        setRooms(detail.getRooms());
        setBedrooms(detail.getBedrooms());
        setBathrooms(detail.getBathrooms());
        setImage(images);

    }
    public DetailView(){

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

    public List<String> getImage() {
        return Image;
    }

    public void setImage(List<String> image) {
        Image = image;
    }

    public Long getLocationId() {
        return LocationId;
    }

    public void setLocationId(Long locationId) {
        LocationId = locationId;
    }
}


