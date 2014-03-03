package com.sr.freightops.entity;

// Generated Mar 2, 2014 8:44:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AddressSupplier generated by hbm2java
 */
@Entity
@Table(name = "address_supplier", catalog = "ernest")
public class AddressSupplier implements java.io.Serializable {

	private static final long serialVersionUID = 7294735019864919414L;
	private AddressSupplierId id;
	private Address address;
	private String isPrimarySupplierAddress;

	public AddressSupplier() {
	}

	public AddressSupplier(AddressSupplierId id, Address address) {
		this.id = id;
		this.address = address;
	}

	public AddressSupplier(AddressSupplierId id, Address address,
			String isPrimarySupplierAddress) {
		this.id = id;
		this.address = address;
		this.isPrimarySupplierAddress = isPrimarySupplierAddress;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "supplierId", column = @Column(name = "supplier_id", nullable = false, length = 10)),
			@AttributeOverride(name = "addressId", column = @Column(name = "address_id", nullable = false, length = 10)) })
	public AddressSupplierId getId() {
		return this.id;
	}

	public void setId(AddressSupplierId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false, insertable = false, updatable = false)
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Column(name = "is_primary_supplier_address", length = 1)
	public String getIsPrimarySupplierAddress() {
		return this.isPrimarySupplierAddress;
	}

	public void setIsPrimarySupplierAddress(String isPrimarySupplierAddress) {
		this.isPrimarySupplierAddress = isPrimarySupplierAddress;
	}

}
