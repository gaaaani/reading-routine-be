package com.example.readingroutine.dto;

import lombok.Getter;

@Getter
public class CreateReadingRecordRequest {
    private Long userId;
    private Long bookId;
}
