# Logistics Demo

This repository contains a demo project for logistics management. The project is designed to showcase basic functionalities such as tracking shipments, trucks, routes and drivers.

## File Structure

The project is organized into several packages, each serving a specific purpose:

- **com.logistics.demo**: The root package containing the main application class.
    - **controllers**: Contains the REST controllers for handling HTTP requests.
        - `ShipmentController.java`: Manages shipment-related endpoints.
        - `TruckController.java`: Manages truck-related endpoints.
        - `RouteController.java`: Manages route-related endpoints.
        - `TruckDriversController.java`: Manages truck driver-related endpoints.
    - **models**: Contains the data models representing the entities in the system.
        - `Shipment.java`: Represents a shipment.
        - `Truck.java`: Represents a truck.
        - `Route.java`: Represents a route.
        - `TruckDriver.java`: Represents a truck driver.
        - `LoadDetails.java`: Represents the details of a load.
        - `Stop.java`: Represents a stop in a route.
    - **repositories**: Contains the repository interfaces for data access.
        - `ShipmentRepository.java`: Repository for shipments.
        - `TruckRepository.java`: Repository for trucks.
        - `RouteRepository.java`: Repository for routes.
        - `TruckDriverRepository.java`: Repository for truck drivers.
    - **services**: Contains the service classes for business logic.
        - `ShipmentService.java`: Service for shipment-related operations.
        - `TruckService.java`: Service for truck-related operations.
        - `RouteService.java`: Service for route-related operations.
        - `TruckDriverService.java`: Service for truck driver-related operations.

- **resources**: Contains configuration files and static resources.
    - `application.properties`: Configuration file for the Spring Boot application.

## Pages

The project includes several HTML pages for managing different aspects of the logistics system:

- **routes.html**: Manages routes, including creating new routes and listing existing ones.
- **trucks.html**: Manages trucks, including creating new trucks and listing existing ones.
- **drivers.html**: Manages drivers, including creating new drivers and listing existing ones.
- **shipments.html**: Manages shipments, including creating new shipments and listing existing ones.
