package com.mkyong.common;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private String name;
	@Autowired
	private Facebook facebook;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Facebook getFacebook() {
		return facebook;
	}
	public void setFacebook(Facebook facebook) {
		this.facebook = facebook;
	}
	
	public void showFacebookAuth(){
		System.out.println("facebook auth=" + facebook.getToken()+":"+facebook.getIsAuthenticated());
		this.facebook.setIsAuthenticated(false);
		System.out.println(facebook.getIsAuthenticated());
	}
}
