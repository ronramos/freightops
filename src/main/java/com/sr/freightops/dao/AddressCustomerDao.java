package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.AddressCustomer;

public interface AddressCustomerDao {

	public void updateAddressCustomer(AddressCustomer addressCustomer);

	public void addAddressCustomer(AddressCustomer addressCustomer);

	public void deleteAddressCustomer(AddressCustomer addressCustomer);

	public AddressCustomer findByAddressCustomerId(java.lang.String id);

	public List<AddressCustomer> findAddressCustomerByExample(
			AddressCustomer instance);

}