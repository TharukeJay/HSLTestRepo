package com.hsl.test.repo.demo.repository;
import com.hsl.test.repo.demo.model.participants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Participant extends JpaRepository<participants,Long> {
}
