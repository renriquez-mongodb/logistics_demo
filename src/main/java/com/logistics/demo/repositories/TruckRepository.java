package com.logistics.demo.repositories;

import com.logistics.demo.models.Truck;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TruckRepository extends MongoRepository<Truck, String> {}
