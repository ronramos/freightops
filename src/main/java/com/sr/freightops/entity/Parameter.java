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
 * Parameter generated by hbm2java
 */
@Entity
@Table(name = "parameter", catalog = "freightops")
public class Parameter implements java.io.Serializable {

	private static final long serialVersionUID = -7589587298671646150L;
	private String paramId;
	private String paramNm;
	private String key;
	private String value;
	private String label;
	private String comments;
	private Date dateCreated;
	private Date dateUpdated;
	private String createdBy;
	private String updatedBy;

	public Parameter() {
	}

	public Parameter(String paramId, String key, String value, String label) {
		this.paramId = paramId;
		this.key = key;
		this.value = value;
		this.label = label;
	}

	public Parameter(String paramId, String paramNm, String key, String value,
			String label, String comments, Date dateCreated, Date dateUpdated,
			String createdBy, String updatedBy) {
		this.paramId = paramId;
		this.paramNm = paramNm;
		this.key = key;
		this.value = value;
		this.label = label;
		this.comments = comments;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Id
	@Column(name = "param_id", unique = true, nullable = false, length = 10)
	public String getParamId() {
		return this.paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	@Column(name = "param_nm", length = 45)
	public String getParamNm() {
		return this.paramNm;
	}

	public void setParamNm(String paramNm) {
		this.paramNm = paramNm;
	}

	@Column(name = "key", nullable = false, length = 45)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "value", nullable = false, length = 45)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "label", nullable = false, length = 45)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name = "comments", length = 45)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
