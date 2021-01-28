package ar.latorraca.api.exception.errors;

public class UnauthorizedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "Error (401) Unauthorized Exception.";
	
	public UnauthorizedException(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
