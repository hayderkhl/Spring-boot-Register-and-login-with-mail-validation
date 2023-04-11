package com.haidar.registerloginwithemailvalidationandsecurity.repository;

import com.haidar.registerloginwithemailvalidationandsecurity.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {

    Optional<ApplicationUser> findByEmail(String email);
}
