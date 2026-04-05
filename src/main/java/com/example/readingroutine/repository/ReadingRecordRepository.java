package com.example.readingroutine.repository;

import com.example.readingroutine.domain.ReadingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingRecordRepository extends JpaRepository<ReadingRecord, Long> {

    List<ReadingRecord> findByUserId(Long userId);
}