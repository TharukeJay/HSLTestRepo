package com.hsl.test.repo.demo.repository;

import com.hsl.test.repo.demo.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface agendaRepository extends JpaRepository<Agenda,Long> {
}
