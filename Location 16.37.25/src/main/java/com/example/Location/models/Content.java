package com.example.Location.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Content {

    @Id
     private  Long IdContent;

    private String Title;

     private  String Description;
     private  int Price;


     private  int PriceIfRenting;

     private String SelectHome;

     private String SelectBuy;

     private int Area;

     private String Path;
    public Content(){};

    public Content(Long idContent, String title, String description, int price, int priceIfRenting, String selectHome, String selectBuy, int area, String path) {
        IdContent = idContent;
        Title = title;
        Description = description;
        Price = price;
        PriceIfRenting = priceIfRenting;
        SelectHome = selectHome;
        SelectBuy = selectBuy;
        Area = area;
        Path = path;
    }

    public Long getIdContent() {
        return IdContent;
    }

    public void setIdContent(Long idContent) {
        IdContent = idContent;
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Content{" +
                "IdContent= " + IdContent +
                ",Title= " + Title +
                ",Description= " + Description +
                ",Price= " + Price +
                ",PriceIfRenting=  " + PriceIfRenting +
                ",SelectHome=  " + SelectHome +
                ",SelectBuy=  " + SelectBuy +
                ",Area=  " + Area +
                ",Path=  " + Path +
                "}";
    }



}
