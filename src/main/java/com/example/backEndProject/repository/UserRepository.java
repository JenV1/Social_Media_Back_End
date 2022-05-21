package com.example.backEndProject.repository;

import com.example.backEndProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE id = ?",nativeQuery = true)
    User findByID(Long id);

}
