package ar.latorraca.api.exception.errors;

public class ConflictException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "Error (409) Conflict Exception.";
	
	public ConflictException(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
