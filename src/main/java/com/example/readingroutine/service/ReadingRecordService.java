package com.example.readingroutine.service;

import com.example.readingroutine.domain.Book;
import com.example.readingroutine.domain.ReadingRecord;
import com.example.readingroutine.domain.ReadingStatus;
import com.example.readingroutine.domain.User;
import com.example.readingroutine.dto.ReadingRecordResponse;
import com.example.readingroutine.repository.BookRepository;
import com.example.readingroutine.repository.ReadingRecordRepository;
import com.example.readingroutine.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReadingRecordService {
    private final ReadingRecordRepository readingRecordRepository;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    // 독서 기록 저장
    public Long createRecord(Long userId, Long bookId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("user not found"));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalArgumentException("book not found"));

        ReadingRecord record = ReadingRecord.builder()
                .user(user)
                .book(book)
                .startedAt(LocalDateTime.now())
                .status(ReadingStatus.READING)
                .build();

        return readingRecordRepository.save(record).getId();
    }

    // 사용자 기록 조회
    public List<ReadingRecordResponse> getRecords(Long userId) {
        return readingRecordRepository.findByUserId(userId).stream()
                .map(record -> new ReadingRecordResponse(
                        record.getId(),
                        record.getBook().getTitle()
                ))
                .toList();
    }
//    public List<ReadingRecord> getRecords(Long userId) {
//        return readingRecordRepository.findByUserId(userId);
//    }

}
