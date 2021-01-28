package ar.latorraca.api.exception.errors;

public class ForbiddenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "Error (403) Forbidden Exception.";
	
	public ForbiddenException(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
