package com.mindtree.bankdata.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private double openingBalance;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "bank_user", joinColumns = { @JoinColumn(name = "userId") }, inverseJoinColumns = {
			@JoinColumn(name = "bankId") })
	private Set<Bank> banks;

	public User() {
	}

	public User(int userId, String userName, double openingBalance, Set<Bank> banks) {
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

	public Set<Bank> getBanks() {
		return banks;
	}

	public void setBanks(Set<Bank> banks) {
		this.banks = banks;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", openingBalance=" + openingBalance + ", banks="
				+ banks + "]";
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
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

}
