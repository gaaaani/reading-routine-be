package com.example.readingroutine.controller;

import com.example.readingroutine.domain.ReadingRecord;
import com.example.readingroutine.dto.ApiResponse;
import com.example.readingroutine.dto.CreateReadingRecordRequest;
import com.example.readingroutine.dto.ReadingRecordResponse;
import com.example.readingroutine.service.ReadingRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/records")
public class ReadingRecordController {

    private final ReadingRecordService readingRecordService;
    @PostMapping
    public ApiResponse<Long> create(@RequestBody CreateReadingRecordRequest request) {
        return ApiResponse.ok(
                readingRecordService.createRecord(
                        request.getUserId(),
                        request.getBookId()
                )
        );
    }

    @GetMapping("/users/{userId}/records")
    public ApiResponse<List<ReadingRecordResponse>> get(@PathVariable Long userId) {
        return ApiResponse.ok(readingRecordService.getRecords(userId));
    }
}