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
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankId;
	private String bankName;
	private String bankLocation;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "bank_user",joinColumns = { @JoinColumn(name = "bankId") }, inverseJoinColumns = { @JoinColumn(name = "userId") })
	private Set<User> users;

	public Bank() {
	}

	public Bank(int bankId, String bankName, String bankLocation, Set<User> users) {
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankLocation=" + bankLocation + ", users="
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
		Bank other = (Bank) obj;
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
