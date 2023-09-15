package test;

public class SchoolExploreException extends Exception{

	public SchoolExploreException() {
	}

	public SchoolExploreException(String message) {
		super(message);
	}

	public SchoolExploreException(String message, Throwable cause) {
		super(message, cause);
	}

	public SchoolExploreException(Throwable cause) {
		super(cause);
	}

	public SchoolExploreException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
