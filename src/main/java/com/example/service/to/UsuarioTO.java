package com.example.service.to;

import java.io.Serializable;

public class UsuarioTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String secret;
	private Integer expiration;

	// SET y GET
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public Integer getExpiration() {
		return expiration;
	}

	public void setExpiration(Integer expiration) {
		this.expiration = expiration;
	}

}
