package com.cognizant.jwt.controller;

import com.cognizant.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return "Missing or invalid Authorization header";
        }

        // Decode credentials
        String base64Credentials = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = decoded.split(":", 2);

        String username = values[0];
        String password = values[1];

        // Replace this with real validation
        if (username.equals("user") && password.equals("pwd")) {
            String token = jwtUtil.generateToken(username);
            return "{\"token\":\"" + token + "\"}";
        } else {
            return "Invalid credentials";
        }
    }
}