package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.User;

public interface UserDao {

	public void updateUser(User user);

	public void addUser(User user);

	public void deleteUser(User user);

	public User findUserById(String id);

	public List<User> findUserByExample(User user);

	public List<User> findAllUser();

}