package com.example.readingroutine.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ApiResponse<T> {

    private boolean success;
    private T data;
    private String message;
}