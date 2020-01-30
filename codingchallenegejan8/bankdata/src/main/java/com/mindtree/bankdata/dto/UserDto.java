package com.mindtree.bankdata.dto;

import java.util.Set;

public class UserDto {

	private int userId;
	private String userName;
	private double openingBalance;
	private Set<BankDto> banks;

	public UserDto() {
	}

	public UserDto(int userId, String userName, double openingBalance, Set<BankDto> banks) {
		this.userId = userId;
		this.userName = userName;
		this.openingBalance = openingBalance;
		this.banks = banks;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public Set<BankDto> getBanks() {
		return banks;
	}

	public void setBanks(Set<BankDto> banks) {
		this.banks = banks;
	}

	@Override
	public String toString() {
		return "userDto [userId=" + userId + ", userName=" + userName + ", openingBalance=" + openingBalance
				+ ", banks=" + banks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
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
		UserDto other = (UserDto) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

}
