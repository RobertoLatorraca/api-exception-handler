package ar.latorraca.api.exception.errors;

public class FieldAlreadyExistException extends ConflictException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_TYPE = "Field Already Exist Exception.";
	
	public FieldAlreadyExistException(String errorDetails) {
		super(ERROR_TYPE + " " + errorDetails);
	}

}
