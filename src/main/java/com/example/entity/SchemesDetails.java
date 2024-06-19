package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEMES_DETAILS")
public class SchemesDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SCHEME_ID")
	private Long schemeId;

	@Column(name = "SCHEME_START_DATE")
	private String schemeStartDate;

	@Column(name = "SCHEME_END_DATE")
	private String schemeEndDate;

	@Column(name = "CREATION_DATE")
	private Timestamp creationDate;

	@Column(name = "SCHEME_CODE", length = 200)
	private String schemeCode;

	@Column(name = "SCHEME_NAME", length = 200)
	private String schemeName;

	@Column(name = "SCHEME_DESCRIPTION", length = 200)
	private String schemeDescription;

	@Column(name = "GOVT_INSTITUTE_ID")
	private Long govtInstituteId;

	public SchemesDetails() {
		super();
	}

	public Long getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(Long schemeId) {
		this.schemeId = schemeId;
	}

	public String getSchemeStartDate() {
		return schemeStartDate;
	}

	public void setSchemeStartDate(String schemeStartDate) {
		this.schemeStartDate = schemeStartDate;
	}

	public String getSchemeEndDate() {
		return schemeEndDate;
	}

	public void setSchemeEndDate(String schemeEndDate) {
		this.schemeEndDate = schemeEndDate;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public Long getGovtInstituteId() {
		return govtInstituteId;
	}

	public void setGovtInstituteId(Long govtInstituteId) {
		this.govtInstituteId = govtInstituteId;
	}



}
