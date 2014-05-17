package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.ContactSupplier;

public interface ContactSupplierDao {

	public void updateContactSupplier(ContactSupplier contactSupplier);

	public void addContactSupplier(ContactSupplier contactSupplier);

	public void deleteContactSupplier(ContactSupplier contactSupplier);

	public ContactSupplier findByContactSupplierId(java.lang.String id);

	public List<ContactSupplier> findContactSupplierByExample(
			ContactSupplier instance);

}