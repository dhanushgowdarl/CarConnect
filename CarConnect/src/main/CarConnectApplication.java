package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import dao.AdminService;
import dao.CustomerService;
import dao.ReservationService;
import dao.VehicleService;
import entity.Admin;
import entity.Customer;
import entity.Reservation;
import entity.Vehicle;

public class CarConnectApplication {

	public static void main(String[] args) {

		VehicleService vehicle = new VehicleService();
		CustomerService customer = new CustomerService();
		AdminService admin = new AdminService();
		ReservationService reservation = new ReservationService();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add Vehicle");
			System.out.println("2. Get Available Vehicles");
			System.out.println("3. Delete Vehicles");
			System.out.println("4. Add Customer");
			System.out.println("5. Search Customer By Id");
			System.out.println("6. Delete Customer");
			System.out.println("7. Add Admin");
			System.out.println("8. Search Admin By Id");
			System.out.println("9. Delete Admin");
			System.out.println("10. Create Reservation");
			System.out.println("11. Cancel Reservation");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.println("Enter Vehicle ID:");
				int vehicleID = scanner.nextInt();
				System.out.println("Enter Model:");
				String model = scanner.next();
				System.out.println("Enter Make:");
				String make = scanner.next();
				System.out.println("Enter Year:");
				int year = scanner.nextInt();
				System.out.println("Enter Color:");
				String color = scanner.next();
				System.out.println("Enter Registration Number:");
				String registrationNumber = scanner.next();
				System.out.println("Enter Availability:");
				boolean availability = scanner.nextBoolean();
				System.out.println("Enter Daily Rate:");
				double dailyRate = scanner.nextDouble();

				Vehicle vehicleToInsert = new Vehicle(vehicleID, model, make, year, color, registrationNumber,
						availability, dailyRate);
				boolean insertSuccess = vehicle.addVehicle(vehicleToInsert);

				if (insertSuccess) {
					System.out.println("Policy inserted successfully.");
				} else {
					System.out.println("Failed to insert policy.");
				}
				break;
			case 2:

				break;
			case 3:
				System.out.println("Enter Vehicle ID to delete:");
				int deleteVehicle = scanner.nextInt();
				// CustomerService.deleteCustomer(deleteCustomer);
				System.out.println("Vehicle deleted Successfully");
				boolean deleteVehicleSuccess = vehicle.removeVehicle(deleteVehicle);

				if (deleteVehicleSuccess) {
					System.out.println("Vehicle deleted successfully.");
				} else {
					System.out.println("Failed to delete Vehicle.");
				}
				break;
			case 4:
				System.out.println("Enter Customer ID:");
				int customerID = scanner.nextInt();
				System.out.println("Enter First Name:");
				String firstName = scanner.next();
				System.out.println("Enter Last Name:");
				String lastName = scanner.next();
				System.out.println("Enter Email:");
				String email = scanner.next();
				System.out.println("Enter Phone Number:");
				String phoneNumber = scanner.next();
				System.out.println("Enter Address:");
				String address = scanner.next();
				System.out.println("Enter Username:");
				String username = scanner.next();
				System.out.println("Enter Password:");
				String password = scanner.next();
				System.out.println("Enter Registration Date:");
				String registrationDate = scanner.next();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate date = LocalDate.parse(registrationDate, formatter);

				Customer customerToInsert = new Customer(customerID, firstName, lastName, email, phoneNumber, address,
						username, password, registrationDate);
				boolean insertcustomerSuccess = customer.registerCustomer(customerToInsert);

				if (insertcustomerSuccess) {
					System.out.println("Policy inserted successfully.");
				} else {
					System.out.println("Failed to insert policy.");
				}
				break;
			case 5:
				break;
			case 6:
				System.out.println("Enter Customer ID to delete:");
				int deleteCustomer = scanner.nextInt();
				// CustomerService.deleteCustomer(deleteCustomer);
				System.out.println("Custormer deleted Successfully");
				boolean deleteCustomerSuccess = customer.deleteCustomer(deleteCustomer);

				if (deleteCustomerSuccess) {
					System.out.println("Customer deleted successfully.");
				} else {
					System.out.println("Failed to delete Customer.");
				}
				break;
			case 7:
				System.out.println("Enter Admin ID:");
				int adminID = scanner.nextInt();
				System.out.println("Enter First Name:");
				String AdfirstName = scanner.next();
				System.out.println("Enter Last Name:");
				String AdlastName = scanner.next();
				System.out.println("Enter Email:");
				String Ademail = scanner.next();
				System.out.println("Enter Phone Number:");
				String AdphoneNumber = scanner.next();
				System.out.println("Enter Username:");
				String Adusername = scanner.next();
				System.out.println("Enter Password:");
				String Adpassword = scanner.next();
				System.out.println("Enter Role:");
				String role = scanner.next();
				System.out.println("Enter Join Date:");
				String joinDate = scanner.next();
				DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate date1 = LocalDate.parse(joinDate, formatter1);
				Admin adminToInsert = new Admin(adminID, AdfirstName, AdlastName, Ademail, AdphoneNumber, Adusername,
						Adpassword, role, joinDate);
				boolean insertAdminSuccess = admin.registerAdmin(adminToInsert);

				if (insertAdminSuccess) {
					System.out.println("Admin added successfully.");
				} else {
					System.out.println("Failed to add Admin.");
				}
				break;
//                case 8:
//                    searchAdminByID(vehicleService);
//                    break;
			case 9:
				System.out.println("Enter Admin ID to delete:");
				int deleteAdmin = scanner.nextInt();
				// CustomerService.deleteCustomer(deleteCustomer);
				System.out.println("Admin deleted Successfully");
				boolean deleteAdminSuccess = admin.deleteAdmin(deleteAdmin);

				if (deleteAdminSuccess) {
					System.out.println("Admin deleted successfully.");
				} else {
					System.out.println("Failed to delete Admin.");
				}
				break;
			case 10:
				System.out.println("Enter Admin ID:");
				int reservationID = scanner.nextInt();
				System.out.println("Enter Customer ID:");
				int recustomerID = scanner.nextInt();
				System.out.println("Enter Vehicle ID:");
				int revehicleID = scanner.nextInt();
				System.out.println("Enter Start Date:");
				String startDate = scanner.nextLine();
				System.out.println("Enter End Date:");
				String endDate = scanner.nextLine();
				System.out.println("Enter TotalCost:");
				double totalCost = scanner.nextDouble();
				System.out.println("Enter Status:");
				String status = scanner.next();

				Reservation reservationToInsert = new Reservation(reservationID, recustomerID, revehicleID, startDate,
						endDate, totalCost, status);
				boolean insertReservationSuccess = reservation.createReservation(reservationToInsert);

				if (insertReservationSuccess) {
					System.out.println("Admin added successfully.");
				} else {
					System.out.println("Failed to add Admin.");
				}
				break;
			case 11:
				System.out.println("Enter Reservation ID to cancel:");
				int deleteReservation = scanner.nextInt();
				// CustomerService.deleteCustomer(deleteCustomer);
				System.out.println("Admin deleted Successfully");
				boolean deleteReservationSuccess = reservation.cancelReservation(deleteReservation);

				if (deleteReservationSuccess) {
					System.out.println("Reservation canceled successfully.");
				} else {
					System.out.println("Failed to cancel Reservation.");
				}
				break;
			case 0:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}

	}

}
//    private static void addVehicle(VehicleService vehicleService, Scanner scanner) {
//        // Collect vehicle details from the user
//        System.out.print("Enter Model: ");
//        String model = scanner.nextLine();
//        System.out.print("Enter Make: ");
//        String make = scanner.nextLine();
//        // ... (collect other details)
//
//        // Create a Vehicle object
//        Vehicle vehicle = new Vehicle();
//        vehicle.setModel(model);
//        vehicle.setMake(make);
//        // ... (set other details)
//
//        try {
//            // Call the service to add the vehicle
//            vehicleService.addVehicle(vehicle);
//            System.out.println("Vehicle added successfully!");
//        } catch (InvalidInputException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//    
//    
//    private static void getAvaibleVehicle(){
//        
//    }
//    
//    private static void deleteVehicle(){
//        
//    }
//    
//    private static void addCustomer(Customer customer){
//        
//    }
//    
//    private static void searchCustomerByID(){
//        
//    }
//    
//    private static void deleteCustomer(int customerId){
//       System.out.println("Enter Customer ID to delete:");
//            int CustomerID = scanner.nextInt();
//
//            boolean deleteSuccess = customer.deleteCustomer(CustomerID);
//
//            if (deleteSuccess) {
//                System.out.println("Policy deleted successfully.");
//            } else {
//                System.out.println("Failed to delete policy.");
//            }
//                    
//    }
//    
//    private static void addAdmin(){
//        
//    }
//    
//    private static void searchAdminByID(){
//        
//    }
//    
//    private static void deleteAdmin(){
//        
//    }
//    
//    private static void createReservation(){
//        
//    }
//    
//    private static void cancelReservation(){
//        
//    }
//}