package ar.latorraca.api.exception.errors;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

import ar.latorraca.api.exception.errors.ErrorMessageBuilder.ErrorText;
import ar.latorraca.api.exception.errors.ErrorMessageBuilder.Optionals;
import ar.latorraca.api.exception.errors.ErrorMessageBuilder.RequestURL;

public class HttpErrorInfo {

	private ZonedDateTime timeStamp;
	private HttpStatus httpStatus;
	private String errorText;
	private String requestURL;
	
	private HttpErrorInfo() {
		this.timeStamp = ZonedDateTime.now();
	}
	
	public static ErrorMessageBuilder.HttpStatusType builder() {
		return new Builder();
	}

	public String getHttpStatus() {
		return httpStatus.toString();
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}
	
	public static class Builder implements ErrorMessageBuilder.HttpStatusType,
											ErrorMessageBuilder.ErrorText,
											ErrorMessageBuilder.RequestURL,
											ErrorMessageBuilder.Optionals {
		
		private HttpErrorInfo errorMessage;
		
		public Builder() {
			this.errorMessage = new HttpErrorInfo();
		}

		@Override
		public ErrorText httpStatus(HttpStatus httpStatus) {
			this.errorMessage.setHttpStatus(httpStatus);
			return this;
		}

		@Override
		public RequestURL errorText(String errorText) {
			this.errorMessage.setErrorText(errorText);
			return this;
		}
		
		@Override
		public Optionals requestURL(String requestURL) {
			this.errorMessage.setRequestURL(requestURL);
			return this;
		}		

		@Override
		public HttpErrorInfo build() {
			return this.errorMessage;
		}

	}
	
}
