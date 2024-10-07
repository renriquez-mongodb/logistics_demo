package com.logistics.demo.models;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "shipments")
public class Shipment {
    @Id
    private String id;
    private LoadDetails loadDetails;
    private String manifest;
    private LocalDateTime pickupTimestamp;
    private LocalDateTime deliveryTimestamp;
    private String status;
    private List<Stop> stops;
    private Truck truck;
}
