package com.mindtree.bankdata.exception.serviceexception;

public class UserIdNotFoundException extends BankDataServiceException {

	public UserIdNotFoundException() {
		super();
	}

	public UserIdNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserIdNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserIdNotFoundException(String arg0) {
		super(arg0);
	}

	public UserIdNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
