package com.mc.invensys.service;

import com.mc.invensys.model.User;

public interface UserService {
	void save(User user);
	
	User findByUsername(String username);
	
}
