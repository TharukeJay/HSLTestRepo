package com.hsl.test.repo.demo.repository;

import com.hsl.test.repo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//    User save(User user);
//
//    User deleteAllById(int id);

//    User findAllById(String id);



}
