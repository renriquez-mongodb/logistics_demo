package com.logistics.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.logistics.demo.models.Shipment;
import com.logistics.demo.services.ShipmentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{id}")
    public Optional<Shipment> getRouteById(@PathVariable String id) {
        return shipmentService.getShipmentById(id);
    }

    @PostMapping
    public Shipment createRoute(@RequestBody Shipment shipment) {
        return shipmentService.addShipment(shipment);
    }

    @PutMapping("/{id}")
    public Shipment updateRoute(@PathVariable String id, @RequestBody Shipment shipment) {
        shipment.setId(id);
        return shipmentService.updateShipment(shipment);
    }

    @DeleteMapping("/{id}")
    public void deleteShipment(@PathVariable String id) {
        shipmentService.deleteShipment(id);
    }
}
