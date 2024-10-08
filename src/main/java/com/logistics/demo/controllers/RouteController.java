package com.logistics.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.logistics.demo.models.Route;
import com.logistics.demo.services.RouteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<Route> getAllTrucks() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public Optional<Route> getRouteById(@PathVariable String id) {
        return routeService.getRouteById(id);
    }

    @PostMapping
    public Route createRoute(@RequestBody Route route) {
        return routeService.addRoute(route);
    }

    @PutMapping("/{id}")
    public Route updateRoute(@PathVariable String id, @RequestBody Route route) {
        route.setId(id);
        return routeService.updateRoute(route);
    }

    @DeleteMapping("/{id}")
    public void deleteRoute(@PathVariable String id) {
        routeService.deleteRoute(id);
    }
}
