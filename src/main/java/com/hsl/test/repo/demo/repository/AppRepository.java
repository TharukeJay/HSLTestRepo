package com.hsl.test.repo.demo.repository;

import com.hsl.test.repo.demo.model.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App,Long> {
}
