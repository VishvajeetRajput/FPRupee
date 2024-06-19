package com.example.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SchemeRequest {

	@NotBlank(message = "schemeStartDate Can not be Empty")
	private String schemeStartDate;

	@NotBlank(message = "schemeEndDate Can not be Empty")
	private String schemeEndDate;

	@NotBlank(message = "schemeCode Can not be Empty")
	@Size(min = 1, max = 50, message = "schemeCode can not be more than 50 words")
	private String schemeCode;

	@NotBlank(message = "schemeName Can not be Empty")
	@Size(min = 1, max = 80, message = "schemeName can not be more than 80 words")
	private String schemeName;

	@NotBlank(message = "schemeDescription Can not be Empty")
	@Size(min = 1, max = 100, message = "schemeDescription can not be more than 100 words")
	private String schemeDescription;

	@NotBlank(message = "govtInstituteId Can not be Empty")
	private Long govtInstituteId;

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
