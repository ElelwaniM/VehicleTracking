package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	private final List<Vehicle> vehicles = new ArrayList<>();

    // Initialize some vehicles
    public VehicleController() {
        vehicles.add(new Vehicle("V1", "Toyota", "Camry", 2020,-25.7469, 28.1881));
        vehicles.add(new Vehicle("V2", "Honda", "Civic", 2019, -25.7469, 28.1881));
    }

    @GetMapping("/getAllVehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable String id) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getId().equals(id))
                .findFirst()
                .orElse(null); // Return null if vehicle not found (you can handle this differently based on your requirements)
    }

    @PostMapping("/add")
    public Vehicle addOrUpdateVehicle(@RequestBody Vehicle vehicle) {
        if (vehicle.getId() != null && !vehicle.getId().isEmpty()) {
            // Update existing vehicle
            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i).getId().equals(vehicle.getId())) {
                    vehicles.set(i, vehicle);
                    return vehicle;
                }
            }
        }

        // Add new vehicle
        vehicles.add(vehicle);
        return vehicle;
    }

    @DeleteMapping("/{id}")
    public String deleteVehicle(@PathVariable String id) {
        vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
        return "Vehicle deleted successfully";
    }

}
