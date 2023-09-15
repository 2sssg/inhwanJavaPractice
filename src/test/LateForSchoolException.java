package test;

public class LateForSchoolException extends Exception{

	public LateForSchoolException() {
	}

	public LateForSchoolException(String message) {
		super(message);
	}

	public LateForSchoolException(String message, Throwable cause) {
		super(message, cause);
	}

	public LateForSchoolException(Throwable cause) {
		super(cause);
	}

	public LateForSchoolException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
