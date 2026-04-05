package com.example.readingroutine.controller;

import com.example.readingroutine.domain.ReadingRecord;
import com.example.readingroutine.dto.ApiResponse;
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
    public ApiResponse<Long> create(@RequestParam Long userId,
                                    @RequestParam Long bookId) {
        Long recordId = readingRecordService.createRecord(userId, bookId);

        return ApiResponse.<Long>builder()
                .success(true)
                .data(recordId)
                .message("독서 기록 생성 성공")
                .build();
    }

    @GetMapping
    public ApiResponse<List<ReadingRecord>> get(@RequestParam Long userId) {
        List<ReadingRecord> records = readingRecordService.getRecords(userId);

        return ApiResponse.<List<ReadingRecord>>builder()
                .success(true)
                .data(records)
                .message("독서 기록 조회 성공")
                .build();
    }
}