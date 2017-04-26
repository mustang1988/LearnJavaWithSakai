package HCMM;

import java.util.Date;

public class Member {
	private String name;
	private Date birthday;
	private String mobile;
	private Pass pass;
	private double fee;
	private String address;
	private String email;

	public Member() {
	}

	public Member(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public boolean validateName() {
		// not null or not empty

		// no numeric character check
		return false;
	}

	public boolean validateMobile() {
		// 8 digits
		return false;
	}

	public boolean validateEmail() {
		// RegExp: [a-zA-Z-_]+@([a-zA-Z_]+\.)+\.[a-zA-Z_]+
		return false;
	}

	public boolean validateBirthday() {
		// d(d)-m(m)-yyyy or d(d)/m(m)/yyyy
		return false;
	}

	public boolean validateFee() {
		// retain 2 decimal
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Pass getPass() {
		return pass;
	}

	public void setPass(Pass pass) {
		this.pass = pass;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
