package com.te.validation.service;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

import com.te.validation.model.User;

public interface UserService {
public  User authenticateUser(String emailAddress,String password);
	
	
}
