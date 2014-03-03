package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Customer;

public interface CustomerDao {

	public void updateCustomer(Customer customer);

	public void addCustomer(Customer customer);

	public void deleteCustomer(Customer customer);

	public Customer findByCustomerId(java.lang.String id);

	public List<Customer> findCustomerByExample(Customer instance);

}