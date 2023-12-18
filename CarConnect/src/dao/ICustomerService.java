package dao;

import entity.Customer;

public interface ICustomerService {

	Customer getCustomerById(int customerId) throws Exception;

	Customer getCustomerByUsername(String username);

	boolean registerCustomer(Customer customerData);

	Customer updateCustomer(Customer customerData);

	boolean deleteCustomer(int customerId);
}
