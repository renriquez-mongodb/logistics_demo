package com.logistics.demo.models;

import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "routes")
public class Route {
    @Id
    private String id;
    private String origin;
    private String destination;
    private int distanceKm;
    private List<Stop> stops;
}
