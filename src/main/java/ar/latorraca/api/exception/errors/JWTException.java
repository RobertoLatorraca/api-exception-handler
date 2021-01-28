package ar.latorraca.api.exception.errors;

public class JWTException extends UnauthorizedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "JWT Exception.";
	
	public JWTException(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
