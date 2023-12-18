package entity;

public class Reservation {

	private int reservationID;
	private int customerID;
	private int vehicleID;
	private String startDate;
	private String endDate;
	private double totalCost;
	private String status;

	public Reservation() {
	}

	public Reservation(int reservationID, int customerID, int vehicleID, String startDate, String endDate,
			double totalCost, String status) {
		this.reservationID = reservationID;
		this.customerID = customerID;
		this.vehicleID = vehicleID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalCost = totalCost;
		this.status = status;
	}

	// Getter and Setter methods

	public int getReservationID() {
		return reservationID;
	}

	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void calculateTotalCost() {
		// total cost based on the duration of the reservation, daily rate.
	}
}
