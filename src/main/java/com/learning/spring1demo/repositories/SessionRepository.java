package com.learning.spring1demo.repositories;

import com.learning.spring1demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
