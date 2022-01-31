package com.te.validation.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.validation.model.User;
import com.te.validation.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public User authenticateUser(String emailAddress, String password) {
		/*
		 * User user=new User(); User findByemailAddress =
		 * repo.findByEmailAddress(emailAddress); User findByPassword =
		 * repo.findByPassword(password);
		 * if(emailAddress.equals(findByemailAddress.getPassword()) &&
		 * password.equals(findByPassword)) { return user; } return null;
		 */
		User user= repo.findByEmailAddress(emailAddress);
		if(emailAddress.equals(user.getEmailAddress())) {
			if(password.equals(user.getPassword())) {
				return user;
			}
		}
		return null;
	}

}
