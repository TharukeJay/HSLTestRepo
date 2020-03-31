package com.hsl.test.repo.demo.repository;


import com.hsl.test.repo.demo.model.event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventRepository extends JpaRepository<event,Long> {

}
