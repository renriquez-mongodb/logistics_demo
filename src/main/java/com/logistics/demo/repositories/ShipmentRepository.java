package com.logistics.demo.repositories;

import com.logistics.demo.models.Shipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipmentRepository extends MongoRepository<Shipment, String> {}
