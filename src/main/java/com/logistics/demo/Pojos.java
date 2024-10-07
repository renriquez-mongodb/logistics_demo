import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "drivers")
class Driver {
    @Id
    private String id;
    private String name;
    private String licenseNumber;
    private String phoneNumber;
    private int experienceYears;
}

@Data
@Document(collection = "trucks")
class Truck {
    @Id
    private String id;
    private String make;
    private String model;
    private int year;
    private String type;
    private int capacityTons;
    private Driver driver;
}

@Data
@Document(collection = "routes")
class Route {
    @Id
    private String id;
    private String origin;
    private String destination;
    private int distanceKm;
    private List<Stop> stops;
}

@Data
class Stop {
    private String stopLocation;
    private LocalDateTime stopTime;
}

@Data
@Document(collection = "shipments")
class Shipment {
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

@Data
class LoadDetails {
    private String type;
    private int weightKg;
    private String description;
}
