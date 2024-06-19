package com.example.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DrivingLicenceRequest {

    @NotBlank(message = "dlNo No can not be Empty")
    @Size(max = 20,min = 1)
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String dlNo;

    @NotBlank(message = "dob No can not be Empty")
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$")
    private String dob;

    

	public String getDlNo() {
		return dlNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
