package com.hsl.test.repo.demo.repository;

import com.hsl.test.repo.demo.model.GameDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDayRepository extends JpaRepository<GameDay,Long> {
}
