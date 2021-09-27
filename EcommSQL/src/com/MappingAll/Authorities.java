package com.MappingAll;

import javax.annotation.processing.Generated;


@Entity
@Table(name = "authoritiesespire")

public class Authorities {
	@Id
	@Generated(strategy = GenerationType.AUTO)

	// Pojo
	private int authoritiesId;
	private String emailId,authorities;
	
	
	public int getAuthoritiesId() {
		return authoritiesId;
	}
	public void setAuthoritiesId(int authoritiesId) {
		this.authoritiesId = authoritiesId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
}