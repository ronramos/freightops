package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Driver;

public interface DriverDao {

	public void updateDriver(Driver driver);

	public void addDriver(Driver driver);

	public void deleteDriver(Driver driver);

	public Driver findByDriverId(java.lang.String id);

	public List<Driver> findDriverByExample(Driver instance);

}