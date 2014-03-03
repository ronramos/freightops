package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Supplier;

public interface SupplierDao {

	public void updateSupplier(Supplier supplier);

	public void addSupplier(Supplier supplier);

	public void deleteSupplier(Supplier supplier);

	public Supplier findBySupplierId(java.lang.String id);

	public List<Supplier> findSupplierByExample(Supplier instance);

}