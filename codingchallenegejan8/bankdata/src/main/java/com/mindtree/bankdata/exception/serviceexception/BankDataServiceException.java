package com.mindtree.bankdata.exception.serviceexception;

import com.mindtree.bankdata.exception.BankDataException;

public class BankDataServiceException extends BankDataException {

	public BankDataServiceException() {
		super();
	}

	public BankDataServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public BankDataServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BankDataServiceException(String arg0) {
		super(arg0);
	}

	public BankDataServiceException(Throwable arg0) {
		super(arg0);
	}

}
