package com.gateway.controller;

import javax.servlet.http.HttpServletRequest;

import com.gateway.config.JwtConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@RestController
public class LoginController {

    @Autowired
    JwtConfig jwtConfig;

    @PutMapping("/logout")
    public Boolean odjava() {
        try {
            System.out.println("ulogovani: " + SecurityContextHolder.getContext().getAuthentication().getName());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @PostMapping("/validate")
    public Boolean validate(HttpServletRequest request) {
        String header = request.getHeader(jwtConfig.getHeader());


        // If there is no token provided and hence the user won't be authenticated.
        // It's Ok. Maybe the user accessing a public path or asking for a token.

        // All secured paths that needs a token are already defined and secured in config class.
        // And If user tried to access without access token, then he won't be authenticated and an exception will be thrown.

        
        String token = header.replace(jwtConfig.getPrefix(), "");
       
        try {
            System.out.println("Kod claimsa");
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtConfig.getSecret().getBytes())
                    .parseClaimsJws(token)
                    .getBody();
            System.out.println("claims: " + claims);
            String username = claims.getSubject();
            return true;
        
        } catch (Exception e) {
        
        	return false;
        }
        
    }
}