package com.example.readingroutine.repository;

import com.example.readingroutine.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}