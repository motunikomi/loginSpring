package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.login.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
