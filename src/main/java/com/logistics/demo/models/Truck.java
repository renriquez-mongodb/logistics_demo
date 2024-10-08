package com.logistics.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "trucks")
public class Truck {
    @Id
    private String id;
    private String make;
    private String model;
    private int year;
    private String type;
    private int capacityTons;
    private TruckDriver driver;
}
