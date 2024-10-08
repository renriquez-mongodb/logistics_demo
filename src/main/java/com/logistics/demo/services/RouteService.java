package com.logistics.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.demo.models.Route;
import com.logistics.demo.repositories.RouteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Optional<Route> getRouteById(String id) {
        return routeRepository.findById(id);
    }

    public Route addRoute(Route truck) {
        return routeRepository.save(truck);
    }

    public void deleteRoute(String id) {
        routeRepository.deleteById(id);
    }

    public Route updateRoute(Route route) {
        return routeRepository.save(route);
    }
}
