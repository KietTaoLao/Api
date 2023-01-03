package com.example.Location.models;


import javax.persistence.*;

@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  Long id;

    private String Title;

     private  String Description;
     private  int Price;


     private  int PriceIfRenting;

     private String SelectHome;

     private String SelectBuy;

     private int Area;

     private String Path;
     @Column(name = "LocationId")
     private Long LocationId;
    public Content(){};

    public Content(Long id, String title, String description, int price, int priceIfRenting, String selectHome, String selectBuy, int area, String path,Long LocationId) {
        this.id = id;
        Title = title;
        Description = description;
        Price = price;
        PriceIfRenting = priceIfRenting;
        SelectHome = selectHome;
        SelectBuy = selectBuy;
        Area = area;
        Path = path;
        this.LocationId = LocationId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPriceIfRenting() {
        return PriceIfRenting;
    }

    public void setPriceIfRenting(int priceIfRenting) {
        PriceIfRenting = priceIfRenting;
    }

    public String getSelectHome() {
        return SelectHome;
    }

    public void setSelectHome(String selectHome) {
        SelectHome = selectHome;
    }

    public String getSelectBuy() {
        return SelectBuy;
    }

    public void setSelectBuy(String selectBuy) {
        SelectBuy = selectBuy;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
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
        return "Content{" +
                "IdContent= " + id +
                ",Title= " + Title +
                ",Description= " + Description +
                ",Price= " + Price +
                ",PriceIfRenting=  " + PriceIfRenting +
                ",SelectHome=  " + SelectHome +
                ",SelectBuy=  " + SelectBuy +
                ",Area=  " + Area +
                ",Path=  " + Path +
                ",LocationId= "+ LocationId +
                "}";
    }



}
