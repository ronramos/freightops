package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Address;

public interface AddressDao {

	public void updateAddress(Address address);

	public void addAddress(Address address);

	public void deleteAddress(Address address);

	public Address findByAddressId(java.lang.String id);

	public List<Address> findAddressByExample(Address instance);

}