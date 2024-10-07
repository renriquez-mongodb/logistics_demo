package com.logistics.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.logistics.demo.models.Truck;
import com.logistics.demo.services.TruckService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trucks")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @GetMapping
    public List<Truck> getAllTrucks() {
        return truckService.getAllTrucks();
    }

    @GetMapping("/{id}")
    public Optional<Truck> getTruckById(@PathVariable String id) {
        return truckService.getTruckById(id);
    }

    @PostMapping
    public Truck createTruck(@RequestBody Truck truck) {
        return truckService.addTruck(truck);
    }

    @PutMapping("/{id}")
    public Truck updateTruck(@PathVariable String id, @RequestBody Truck truck) {
        truck.setId(id);
        return truckService.updateTruck(truck);
    }

    @DeleteMapping("/{id}")
    public void deleteTruck(@PathVariable String id) {
        truckService.deleteTruck(id);
    }
}
