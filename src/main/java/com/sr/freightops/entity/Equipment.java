package com.sr.freightops.entity;

// Generated Mar 2, 2014 8:44:55 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Equipment generated by hbm2java
 */
@Entity
@Table(name = "equipment", catalog = "ernest")
public class Equipment implements java.io.Serializable {

	private static final long serialVersionUID = -1041988422357856549L;
	private String id;
	private String type;
	private String status;
	private String plateNumber;
	private String supplierId;
	private Date dateCreated;
	private Date dateUpdated;
	private String createdBy;
	private String updatedBy;

	public Equipment() {
	}

	public Equipment(String id) {
		this.id = id;
	}

	public Equipment(String id, String type, String status, String plateNumber,
			String supplierId, Date dateCreated, Date dateUpdated,
			String createdBy, String updatedBy) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.plateNumber = plateNumber;
		this.supplierId = supplierId;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 10)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "plate_number", length = 45)
	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@Column(name = "supplier_id", length = 10)
	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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

}