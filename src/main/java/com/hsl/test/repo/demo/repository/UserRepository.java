package com.hsl.test.repo.demo.repository;

import com.hsl.test.repo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
