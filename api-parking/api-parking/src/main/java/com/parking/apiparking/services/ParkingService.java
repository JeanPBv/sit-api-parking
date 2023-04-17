package com.parking.apiparking.services;

import com.parking.apiparking.entity.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingService {

    private List<Car> parkingLot;

    public ParkingService(){
        this.parkingLot = new ArrayList<>();
    }

    public List<Car> getAllCars(){
        return this.parkingLot;
    }

    public void addCar(Car car){
        this.parkingLot.add(car);
    }

    public Optional<Car> getCarByLicensePlate(String licensePlate){
        return this.parkingLot.stream().filter(car -> car.getLicensePlate().equals(licensePlate)).findFirst();
    }


}
