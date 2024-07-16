package com.example.resume.common.exception;

/**
 * {@link GenericBadRequestException} is designed to be thrown when the HTTP response code is desired.
 */
@SuppressWarnings("unused")
public class GenericBadRequestException extends RuntimeException {
  private static final String MESSAGE = "Bad request";

  public GenericBadRequestException() {
    super(MESSAGE);
  }

  public GenericBadRequestException(String message) {
    super(message);
  }

  public GenericBadRequestException(Throwable cause) {
    super(MESSAGE, cause);
  }

  public GenericBadRequestException(String message, Throwable cause) {
    super(message, cause);
  }
}
