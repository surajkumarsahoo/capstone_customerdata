package com.mindtree.bankdata.dto;

import java.util.Set;

public class BankDto {

	private int bankId;
	private String bankName;
	private String bankLocation;
	private Set<UserDto> users;

	public BankDto() {
	}

	public BankDto(int bankId, String bankName, String bankLocation, Set<UserDto> users) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankLocation = bankLocation;
		this.users = users;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankLocation() {
		return bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	public Set<UserDto> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDto> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "BankDto [bankId=" + bankId + ", bankName=" + bankName + ", bankLocation=" + bankLocation + ", users="
				+ users + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bankId;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankDto other = (BankDto) obj;
		if (bankId != other.bankId)
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		return true;
	}

}
