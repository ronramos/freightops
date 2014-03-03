package com.sr.freightops.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.ParameterDao;
import com.sr.freightops.dao.UserDao;
import com.sr.freightops.entity.Parameter;
import com.sr.freightops.entity.User;
import com.sr.freightops.service.UserService;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	UserDao userDao;
	ParameterDao parameterDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setParameterDao(ParameterDao parameterDao) {
		this.parameterDao = parameterDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ernest.service.UserService#addUser(com.ernest.entity.User)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(User user) {
		userDao.addUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ernest.service.UserService#updateUser(com.ernest.entity.User)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ernest.service.UserService#deleteUser(com.ernest.entity.User)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ernest.service.UserService#findUserById(java.lang.String)
	 */
	@Override
	public User findUserById(String id) {
		return userDao.findUserById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ernest.service.UserService#findAllUser()
	 */
	@Override
	public List<User> findAllUser() {
		List<User> users = userDao.findAllUser();
		for (User user : users) {
			Parameter statusParam = parameterDao.findParameterByKey(user
					.getStatus());
			Parameter typeParam = parameterDao.findParameterByKey(user
					.getType());
			if (statusParam != null)
				user.setStatus(statusParam.getValue());
			if (typeParam != null)
				user.setType(typeParam.getValue());
		}
		return users;
	}

	public User findUserByUserName(String userName) {
		User user = new User();
		user.setUsername(userName);
		List<User> result = userDao.findUserByExample(user);
		if (result != null && !result.isEmpty())
			return result.get(0);
		return null;
	}
}
