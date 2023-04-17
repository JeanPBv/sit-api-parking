package com.parking.apiparking.controller;

import com.parking.apiparking.entity.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.parking.apiparking.services.ParkingService;

import java.util.List;

@RestController //Notación que indica el comportamiento al acceso a los verbos hhtp a los status de respuesta y cada metodo tendra una URL que identificará al recurso que quiere acceder
@RequestMapping("/parking") //parking -- URL

public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService){
        this.parkingService = parkingService;
    }

    //GET: http://dominio/parkings/cars
    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(this.parkingService.getAllCars());
    }

    //POST: http://dominio/parkings/cars
    @PostMapping("/cars")
    public ResponseEntity<Car> addCars(Car car){
       this.parkingService.addCar(car);
       return new ResponseEntity<>(car, HttpStatus.CREATED);
    }


}
