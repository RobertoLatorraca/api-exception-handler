package ar.latorraca.api.exception.errors;

public class MethodNotAllowed extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "Error (405) Method Not Allowed Exception.";
	
	public MethodNotAllowed(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
