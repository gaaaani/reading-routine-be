package com.example.readingroutine.repository;

import com.example.readingroutine.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}