package com.logistics.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.demo.models.Truck;
import com.logistics.demo.repositories.TruckRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TruckService {
    @Autowired
    private TruckRepository truckRepository;

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public Optional<Truck> getTruckById(String id) {
        return truckRepository.findById(id);
    }

    public Truck addTruck(Truck truck) {
        return truckRepository.save(truck);
    }

    public void deleteTruck(String id) {
        truckRepository.deleteById(id);
    }

    public Truck updateTruck(Truck truck) {
        return truckRepository.save(truck);
    }
}
