package atul.backend.oauth.model;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class ErrorDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private HttpStatus httpStatus;
    private String code;
    private String message;
    private List<String> errors;

    public ErrorDetails(HttpStatus httpStatus, String code, String message, String errors) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
        this.errors = Arrays.asList(errors);
    }

    public ErrorDetails(HttpStatus httpStatus, String code, String message, List<String> errors) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

    public ErrorDetails() {
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(final String errors) {
        this.errors = Arrays.asList(errors);
    }
}
