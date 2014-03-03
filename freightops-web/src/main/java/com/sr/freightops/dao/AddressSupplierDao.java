package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.AddressSupplier;

public interface AddressSupplierDao {

	public void updateAddressSupplier(AddressSupplier addressSupplier);

	public void addAddressSupplier(AddressSupplier addressSupplier);

	public void deleteAddressSupplier(AddressSupplier addressSupplier);

	public AddressSupplier findByAddressSupplierId(java.lang.String id);

	public List<AddressSupplier> findAddressSupplierByExample(
			AddressSupplier instance);

}