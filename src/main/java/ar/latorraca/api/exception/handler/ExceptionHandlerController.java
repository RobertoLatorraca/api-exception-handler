package ar.latorraca.api.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import ar.latorraca.api.exception.errors.*;

@ControllerAdvice
public class ExceptionHandlerController {

	@ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({ConflictException.class})
    @ResponseBody
    public HttpErrorInfo handleConflictException(HttpServletRequest request, Exception exception) {
		return HttpErrorInfo.builder()
    						.httpStatus(HttpStatus.CONFLICT)
    						.errorText(exception.getMessage())
    						.requestURL(request.getRequestURL().toString())
    						.build();
    }

	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({BadRequestException.class,
				        org.springframework.web.HttpRequestMethodNotSupportedException.class,
				        org.springframework.web.bind.MethodArgumentNotValidException.class,
				        org.springframework.web.bind.MissingRequestHeaderException.class,
				        org.springframework.web.bind.MissingServletRequestParameterException.class,
				        org.springframework.web.method.annotation.MethodArgumentTypeMismatchException.class,
				        org.springframework.http.converter.HttpMessageNotReadableException.class})
    @ResponseBody
    public HttpErrorInfo handleBadRequestException(HttpServletRequest request, Exception exception) {
    	return HttpErrorInfo.builder()
    						.httpStatus(HttpStatus.BAD_REQUEST)
    						.errorText(exception.getMessage())
    						.requestURL(request.getRequestURL().toString())
    						.build();
    }
    
	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({NotFoundException.class})
    @ResponseBody
    public HttpErrorInfo handleNotFoundException(HttpServletRequest request, Exception exception) {
    	return HttpErrorInfo.builder()
    						.httpStatus(HttpStatus.NOT_FOUND)
    						.errorText(exception.getMessage())
    						.requestURL(request.getRequestURL().toString())
    						.build();
    }
	
	@ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ForbiddenException.class})
    @ResponseBody
    public HttpErrorInfo handleForbiddenException(HttpServletRequest request, Exception exception) {
    	return HttpErrorInfo.builder()
    						.httpStatus(HttpStatus.FORBIDDEN)
    						.errorText(exception.getMessage())
    						.requestURL(request.getRequestURL().toString())
    						.build();
    }
	
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler({UnauthorizedException.class})
	public void handleUnauthorizedException() {
		// Empty
	}
    
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public HttpErrorInfo handleInternalServerError(HttpServletRequest request, Exception exception) {
    	return HttpErrorInfo.builder()
    						.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    						.errorText(exception.getMessage())
    						.requestURL(request.getRequestURL().toString())
    						.build();
    }
    
}
