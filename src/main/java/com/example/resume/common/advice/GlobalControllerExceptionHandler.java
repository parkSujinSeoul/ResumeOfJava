package com.example.resume.common.advice;

import com.example.resume.common.exception.GenericBadRequestException;
import com.example.resume.dto.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalControllerExceptionHandler {

    /**
     * Every exception which should be considered a 'Bad Request' error come here.
     */
    @ExceptionHandler(GenericBadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response<Void> handleInvalidException(GenericBadRequestException runtimeException) {
        log.error(runtimeException.getMessage(), runtimeException);

        return createResponseDto(runtimeException.getMessage());
    }


    private static Response<Void> createResponseDto(String message) {
        return Response.<Void>builder()
                .message(message)
                .build();
    }
}
