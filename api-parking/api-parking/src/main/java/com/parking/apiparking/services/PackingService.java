package com.parking.apiparking.services;

import com.parking.apiparking.entity.Car;
import java.util.ArrayList;
import java.util.List;

public class PackingService {

    private List<Car> parkingLot;

    public PackingService(){
        this.parkingLot = new ArrayList<>();
    }

    public List<Car> getAllCars(){
        return this.parkingLot;
    }

    public void addCar(Car car){
        this.parkingLot.add(car);
    }

    
}
