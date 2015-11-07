package ma.sven.technologie.model;

import javax.validation.constraints.Size;

import ma.sven.technologie.view.Phone;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Attendee {

	@Size(min = 2, max = 30)
	private String name;

	@NotEmpty @Email
	private String emailAddress;
	
	@NotEmpty @Phone
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
