package com.haidar.registerloginwithemailvalidationandsecurity.controller;

import com.haidar.registerloginwithemailvalidationandsecurity.dto.RegistrationDto;
import com.haidar.registerloginwithemailvalidationandsecurity.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authentication")
@RequiredArgsConstructor
public class AuthenticationController {

    private final RegistrationService service;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegistrationDto registrationDto
    ) {
        return ResponseEntity.ok(service.register(registrationDto));
    }

    @GetMapping("/confirm")
    public ResponseEntity<String> confirm(
            @RequestParam String token
    ) {
        return ResponseEntity.ok(service.confirm(token));
    }
}