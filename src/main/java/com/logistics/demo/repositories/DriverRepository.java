package com.logistics.demo.repositories;

import com.logistics.demo.models.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverRepository extends MongoRepository<Driver, String> {}
