package com.example.Location.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Content {

    @Id
     private  Long IdContent;
     private  String Description;
     private  int Price;
     private  int PriceIfRenting;
    private  String TypeOfRealEstase;

    private  String RentOfSell;
    public Content(){};

    public Content( String description, int price, int priceIfRenting, String typeOfRealEstase, String rentOfSell){
        Description = description;
        Price = price;
        PriceIfRenting = priceIfRenting;
        TypeOfRealEstase = typeOfRealEstase;
        RentOfSell = rentOfSell;
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
    public Long getIdContent() {
        return IdContent;
    }

    public void setIdContent(Long idContent) {
        IdContent = idContent;
    }


    public int getPriceIfRenting() {
        return PriceIfRenting;
    }

    public void setPriceIfRenting(int priceIfRenting) {
        PriceIfRenting = priceIfRenting;
    }

    public String getTypeOfRealEstase() {
        return TypeOfRealEstase;
    }

    public void setTypeOfRealEstase(String typeOfRealEstase) {
        TypeOfRealEstase = typeOfRealEstase;
    }

    public String getRentOfSell() {
        return RentOfSell;
    }

    public void setRentOfSell(String rentOfSell) {
        RentOfSell = rentOfSell;
    }




    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Content{" +
                "IdContent= " + IdContent +
                ",Description= " + Description +
                ",Price= " + Price +
                ",PriceIfRenting=  " + PriceIfRenting +
                ",TypeOfRealEstase=  " + TypeOfRealEstase +
                ",RentOfSell=  " + RentOfSell +
                "}";
    }



}
