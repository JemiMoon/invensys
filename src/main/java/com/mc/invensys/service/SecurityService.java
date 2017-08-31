package com.mc.invensys.service;


public interface SecurityService {
	String findLoggedInUsername();
	
	void autologin(String username, String password);
}
