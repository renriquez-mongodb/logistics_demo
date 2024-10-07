import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverRepository extends MongoRepository<Driver, String> {}

public interface TruckRepository extends MongoRepository<Truck, String> {}

public interface RouteRepository extends MongoRepository<Route, String> {}

public interface ShipmentRepository extends MongoRepository<Shipment, String> {}
