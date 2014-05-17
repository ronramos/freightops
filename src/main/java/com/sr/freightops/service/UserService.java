package com.sr.freightops.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.entity.User;

public interface UserService {

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(User user);

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void updateUser(User user);

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteUser(User user);

	public User findUserById(String id);

	public List<User> findAllUser();
	
	public User findUserByUserName(String userName);

}