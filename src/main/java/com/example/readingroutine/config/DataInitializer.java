package com.example.readingroutine.config;

import com.example.readingroutine.domain.*;
import com.example.readingroutine.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @Bean
    public CommandLineRunner initData() {
        return args -> {

            // 테스트용 유저 10명
            for (int i = 1; i <= 10; i++) {
                userRepository.save(
                        User.builder()
                                .username("user" + i)
                                .build()
                );
            }

            // 테스트용 책 10권
            for (int i = 1; i <= 10; i++) {
                bookRepository.save(
                        Book.builder()
                                .title("book" + i)
                                .writer("author" + i)
                                .build()
                );
            }
        };
    }
}