package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.ContactCustomer;

public interface ContactCustomerDao {

	public void updateContactCustomer(ContactCustomer contactCustomer);

	public void addContactCustomer(ContactCustomer contactCustomer);

	public void deleteContactCustomer(ContactCustomer contactCustomer);

	public ContactCustomer findByContactCustomerId(java.lang.String id);

	public List<ContactCustomer> findContactCustomerByExample(
			ContactCustomer instance);

}