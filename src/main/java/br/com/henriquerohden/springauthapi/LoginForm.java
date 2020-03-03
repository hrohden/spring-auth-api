package br.com.henriquerohden.springauthapi;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import lombok.Data;

@Data
public class LoginForm {

    private String username;
    private String password;
    
	public UsernamePasswordAuthenticationToken getAuthenticationManager() {
		return new UsernamePasswordAuthenticationToken(username, password);
	}
}
