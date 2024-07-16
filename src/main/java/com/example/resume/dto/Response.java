package com.example.resume.dto;

import lombok.Builder;

@Builder
public record Response<T> (String resultCode, String message, T data){

}
