package com.logistics.demo.repositories;

import com.logistics.demo.models.TruckDriver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TruckDriverRepository extends MongoRepository<TruckDriver, String> {}
