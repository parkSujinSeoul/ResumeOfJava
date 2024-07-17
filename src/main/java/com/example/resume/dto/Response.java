package com.example.resume.dto;

import lombok.Builder;

@Builder
public record Response<T> (String message, T data){

}
