package com.logistics.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.demo.models.TruckDriver;
import com.logistics.demo.repositories.TruckDriverRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TruckDriverService {
    @Autowired
    private TruckDriverRepository truckDriverRepository;

    public List<TruckDriver> getAllTruckDrivers() {
        return truckDriverRepository.findAll();
    }

    public Optional<TruckDriver> getTruckDriverById(String id) {
        return truckDriverRepository.findById(id);
    }

    public TruckDriver addTruckDriver(TruckDriver truck) {
        return truckDriverRepository.save(truck);
    }

    public void deleteTruckDriver(String id) {
        truckDriverRepository.deleteById(id);
    }

    public TruckDriver updateTruckDriver(TruckDriver truckDriver) {
        return truckDriverRepository.save(truckDriver);
    }
}
