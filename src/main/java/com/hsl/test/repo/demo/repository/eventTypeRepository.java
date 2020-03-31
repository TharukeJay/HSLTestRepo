package com.hsl.test.repo.demo.repository;

import com.hsl.test.repo.demo.model.eventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventTypeRepository extends JpaRepository<eventType,Long> {

}
