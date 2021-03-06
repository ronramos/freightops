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
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "freightops")
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = 5143899120111094764L;
	private String id;
	private String companyName;
	private String code;
	private Date dateCreated;
	private Date dateUpdated;
	private String createdBy;
	private String updatedBy;
	private Set<AddressCustomer> addressCustomers = new HashSet<AddressCustomer>(0);
	private Set<ContactCustomer> contactCustomers = new HashSet<ContactCustomer>(0);
	private Set<User> users = new HashSet<User>(0);

	public Customer() {
	}

	public Customer(String id) {
		this.id = id;
	}

	public Customer(String id, String companyName, String code,
			Date dateCreated, Date dateUpdated, String createdBy,
			String updatedBy, Set<AddressCustomer> addressCustomers, Set<ContactCustomer> contactCustomers,
			Set<User> users) {
		this.id = id;
		this.companyName = companyName;
		this.code = code;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.addressCustomers = addressCustomers;
		this.contactCustomers = contactCustomers;
		this.users = users;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 10)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "company_name", length = 45)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "code", length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<AddressCustomer> getAddressCustomers() {
		return this.addressCustomers;
	}

	public void setAddressCustomers(Set<AddressCustomer> addressCustomers) {
		this.addressCustomers = addressCustomers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<ContactCustomer> getContactCustomers() {
		return this.contactCustomers;
	}

	public void setContactCustomers(Set<ContactCustomer> contactCustomers) {
		this.contactCustomers = contactCustomers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
