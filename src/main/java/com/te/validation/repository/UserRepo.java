package com.te.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.validation.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByEmailAddress(String emailAddress);
	public User findByPassword(String password);
}
