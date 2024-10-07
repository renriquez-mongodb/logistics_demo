package com.logistics.demo.repositories;

import com.logistics.demo.models.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, String> {}
