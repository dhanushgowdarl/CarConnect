package dao;

import entity.Vehicle;

public interface IVehicleService {

	Vehicle getAvailableVehicles();

	Vehicle addVehicle(String vehicleData);

	Vehicle updateVehicle(String vehicleData);

	boolean removeVehicle(int vehicleId);

	Vehicle updateVehicle(Vehicle vehicle);

	boolean addVehicle(Vehicle vehicle);

	Vehicle getVehiclebyId(int vehicleId);

}
