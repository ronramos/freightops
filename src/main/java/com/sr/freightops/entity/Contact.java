package com.sr.freightops.entity;

// Generated Mar 2, 2014 8:44:55 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name = "contact", catalog = "freightops")
public class Contact implements java.io.Serializable {

	private static final long serialVersionUID = 650074130553335632L;
	private String id;
	private String contactPerson;
	private String contactNumber;
	private String contactType;
	private Date dateCreated;
	private Date dateUpdated;
	private String createdBy;
	private String updatedBy;
	private Set<ContactSupplier> contactSuppliers = new HashSet<ContactSupplier>(0);
	private Set<ContactCustomer> contactCustomers = new HashSet<ContactCustomer>(0);

	public Contact() {
	}

	public Contact(String id) {
		this.id = id;
	}

	public Contact(String id, String contactPerson, String contactNumber,
			String contactType, Date dateCreated, Date dateUpdated,
			String createdBy, String updatedBy, Set<ContactSupplier> contactSuppliers,
			Set<ContactCustomer> contactCustomers) {
		this.id = id;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.contactType = contactType;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.contactSuppliers = contactSuppliers;
		this.contactCustomers = contactCustomers;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 10)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "contact_person", length = 45)
	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Column(name = "contact_number", length = 45)
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "contact_type", length = 45)
	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created", length = 19)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_updated", length = 19)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Column(name = "created_by", length = 45)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "updated_by", length = 45)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contact")
	public Set<ContactSupplier> getContactSuppliers() {
		return this.contactSuppliers;
	}

	public void setContactSuppliers(Set<ContactSupplier> contactSuppliers) {
		this.contactSuppliers = contactSuppliers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contact")
	public Set<ContactCustomer> getContactCustomers() {
		return this.contactCustomers;
	}

	public void setContactCustomers(Set<ContactCustomer> contactCustomers) {
		this.contactCustomers = contactCustomers;
	}

}
