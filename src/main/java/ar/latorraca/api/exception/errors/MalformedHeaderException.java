package ar.latorraca.api.exception.errors;

public class MalformedHeaderException extends BadRequestException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "Malformed Header Exception.";
	
	public MalformedHeaderException(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
