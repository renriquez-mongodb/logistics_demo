package com.logistics.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.logistics.demo.models.TruckDriver;
import com.logistics.demo.services.TruckDriverService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drivers")
public class TruckDriversController {

    @Autowired
    private TruckDriverService truckService;

    @GetMapping
    public List<TruckDriver> getAllTruckDrivers() {
        return truckService.getAllTruckDrivers();
    }

    @GetMapping("/{id}")
    public Optional<TruckDriver> getTruckById(@PathVariable String id) {
        return truckService.getTruckDriverById(id);
    }

    @PostMapping
    public TruckDriver createTruck(@RequestBody TruckDriver truckDriver) {
        return truckService.addTruckDriver(truckDriver);
    }

    @PutMapping("/{id}")
    public TruckDriver updateTruck(@PathVariable String id, @RequestBody TruckDriver truckDriver) {
        truckDriver.setId(id);
        return truckService.updateTruckDriver(truckDriver);
    }

    @DeleteMapping("/{id}")
    public void deleteTruck(@PathVariable String id) {
        truckService.deleteTruckDriver(id);
    }
}
