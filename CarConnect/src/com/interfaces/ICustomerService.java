package com.interfaces;

import com.domainClasses.Customer;

public interface ICustomerService {

	Customer getCustomerById(int customerId);

	Customer getCustomerByUsername(String username);

	Customer registerCustomer(Customer customerData);

	Customer updateCustomer(Customer customerData);

	Customer deleteCustomer(int customerId);
}
