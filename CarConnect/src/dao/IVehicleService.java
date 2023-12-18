package dao;

import entity.Vehicle;

public interface IVehicleService {

	Vehicle getVehicleIdbyId(int vehicleId);

	Vehicle getAvailableVehicles();

	Vehicle addVehicle(String vehicleData);

	Vehicle updateVehicle(String vehicleData);

	Vehicle removeVehicle(int vehicleId);

}
