package com.haidar.registerloginwithemailvalidationandsecurity.repository;

import com.haidar.registerloginwithemailvalidationandsecurity.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);
}
