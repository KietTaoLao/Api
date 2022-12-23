package com.example.Location.models;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class utility {

    @Id
    private Long idUtility;
    private Integer Pool;
    private Integer Garage;
    private Integer Backyard;
    private Integer Playground;
    private Integer Laundry;
    private Integer Gym;
    private Integer RecreationRoom;
    private Integer KitchenEquipment;
    private Integer SolarPower;
    private Integer AirConditioning;
    private Integer Heater;
    private Integer Ventilation;
    private Integer WasherDryer;
    private Integer SmokeExtractor;
    private Integer Elevator;
    private Integer Wifi;

    public  utility(){}

    public utility(Long idUtility, Integer pool, Integer garage, Integer backyard, Integer playground, Integer laundry, Integer gym, Integer recreationRoom, Integer kitchenEquipment, Integer solarPower, Integer airConditioning, Integer heater, Integer ventilation, Integer washerDryer, Integer smokeExtractor, Integer elevator, Integer wifi) {
        idUtility = idUtility;
        Pool = pool;
        Garage = garage;
        Backyard = backyard;
        Playground = playground;
        Laundry = laundry;
        Gym = gym;
        RecreationRoom = recreationRoom;
        KitchenEquipment = kitchenEquipment;
        SolarPower = solarPower;
        AirConditioning = airConditioning;
        Heater = heater;
        Ventilation = ventilation;
        WasherDryer = washerDryer;
        SmokeExtractor = smokeExtractor;
        Elevator = elevator;
        Wifi = wifi;
    }

    public Long getIdUtility() {
        return idUtility;
    }

    public void setIdUtility(Long idUtility) {
        this.idUtility = idUtility;
    }

    public Integer getPool() {
        return Pool;
    }

    public void setPool(Integer pool) {
        Pool = pool;
    }

    public Integer getGarage() {
        return Garage;
    }

    public void setGarage(Integer garage) {
        Garage = garage;
    }

    public Integer getBackyard() {
        return Backyard;
    }

    public void setBackyard(Integer backyard) {
        Backyard = backyard;
    }

    public Integer getPlayground() {
        return Playground;
    }

    public void setPlayground(Integer playground) {
        Playground = playground;
    }

    public Integer getLaundry() {
        return Laundry;
    }

    public void setLaundry(Integer laundry) {
        Laundry = laundry;
    }

    public Integer getGym() {
        return Gym;
    }

    public void setGym(Integer gym) {
        Gym = gym;
    }

    public Integer getRecreationRoom() {
        return RecreationRoom;
    }

    public void setRecreationRoom(Integer recreationRoom) {
        RecreationRoom = recreationRoom;
    }

    public Integer getKitchenEquipment() {
        return KitchenEquipment;
    }

    public void setKitchenEquipment(Integer kitchenEquipment) {
        KitchenEquipment = kitchenEquipment;
    }

    public Integer getSolarPower() {
        return SolarPower;
    }

    public void setSolarPower(Integer solarPower) {
        SolarPower = solarPower;
    }

    public Integer getAirConditioning() {
        return AirConditioning;
    }

    public void setAirConditioning(Integer airConditioning) {
        AirConditioning = airConditioning;
    }

    public Integer getHeater() {
        return Heater;
    }

    public void setHeater(Integer heater) {
        Heater = heater;
    }

    public Integer getVentilation() {
        return Ventilation;
    }

    public void setVentilation(Integer ventilation) {
        Ventilation = ventilation;
    }

    public Integer getWasherDryer() {
        return WasherDryer;
    }

    public void setWasherDryer(Integer washerDryer) {
        WasherDryer = washerDryer;
    }

    public Integer getSmokeExtractor() {
        return SmokeExtractor;
    }

    public void setSmokeExtractor(Integer smokeExtractor) {
        SmokeExtractor = smokeExtractor;
    }

    public Integer getElevator() {
        return Elevator;
    }

    public void setElevator(Integer elevator) {
        Elevator = elevator;
    }

    public Integer getWifi() {
        return Wifi;
    }

    public void setWifi(Integer wifi) {
        Wifi = wifi;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "utility{" +
                "id= " + idUtility +
                ",Pool= " + Pool +
                ",Garage= " + Garage +
                ",Backyard=  " + Backyard +
                "Playground= " + Playground +
                ",Laundry= " + Laundry +
                ",Gym= " + Gym +
                ",RecreationRoom=  " + RecreationRoom +
                "KitchenEquipment= " + KitchenEquipment +
                ",SolarPower= " + SolarPower +
                ",AirConditioning= " + AirConditioning +
                ",Heater=  " + Heater +
                ",Ventilation=  " + Ventilation +
                "WasherDryer= " + WasherDryer +
                ",SmokeExtractor= " + SmokeExtractor +
                ",Elevator= " + Elevator +
                ",Wifi=  " + Wifi +
                "}";
    }
}
