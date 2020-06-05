package com.authorization.authorizationService.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.authorization.authorizationService.exceptions.InvalidJWTokenException;
import com.authorization.authorizationService.model.RoleName;
import com.authorization.authorizationService.repository.RoleRepository;
import com.authorization.authorizationService.security.auth.JwtTokenProvider;
import com.authorization.authorizationService.security.auth.UserPrincipal;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Service
public class ValidateTokenAndPermission {
	
	@Value("$auth.jwtSecret")
	private String jwtSecret;
	
	private static final Logger logger=LoggerFactory.getLogger(ValidateTokenAndPermission.class);
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private JwtTokenProvider jwtProvider;
	
	public List<String> getPermissions(String authToken) throws InvalidJWTokenException {
		if(validateJwtToken(authToken)) {
			UserPrincipal up = jwtProvider.getUserPrincipal(authToken);
			System.out.println(up.getUsername() + " username");

			List<String> permissions = new ArrayList<String>();
			
			up.getAuthorities().forEach(role -> {
				System.out.println(role.getAuthority() + " authority");
				permissions.add(role.getAuthority().toString());
			});
			
			return permissions;
		}
		
		return null;
	}
	
	public RoleName getRoleName(String role) {
		if(role.equals(RoleName.ROLE_ADMIN.toString())) {
			return RoleName.ROLE_ADMIN;
		} else if(role.equals(RoleName.ROLE_AGENT.toString())) {
			return RoleName.ROLE_AGENT;
		} else {
			return RoleName.ROLE_USER;
		}
	}
	
	public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid JWT signature -> Message: {} ", e);
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token -> Message: {}", e);
        } catch (ExpiredJwtException e) {
            logger.error("Expired JWT token -> Message: {}", e);
        } catch (UnsupportedJwtException e) {
            logger.error("Unsupported JWT token -> Message: {}", e);
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty -> Message: {}", e);
        }
        
        return false;
    }
}