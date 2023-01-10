package com.todo.doto.utils;

import org.springframework.http.HttpStatus;
import org.springframework.security.jwt.Jwt;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;

public class JWTUtils {

    public static String getJWT(int id) {
        String createdAt = new Date().toString();
        try {
            return Jwt.builder().setClaims(claims).setSubject(userDetails.getUsername())
                    .setIssuedAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
                    .signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.FAILED_DEPENDENCY, ErrorConstants.JWT_ERROR);
        }
    }
}
