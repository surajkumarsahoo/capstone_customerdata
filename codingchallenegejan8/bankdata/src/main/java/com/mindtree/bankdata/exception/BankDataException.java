package com.mindtree.bankdata.exception;

public class BankDataException extends Exception {

	public BankDataException() {
		super();
	}

	public BankDataException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public BankDataException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BankDataException(String arg0) {
		super(arg0);
	}

	public BankDataException(Throwable arg0) {
		super(arg0);
	}

}
