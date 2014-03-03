package com.sr.freightops.dao.impl;

// Generated Feb 11, 2014 3:09:30 PM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.UserDao;
import com.sr.freightops.entity.User;

/**
 * Home object for domain model class User.
 * 
 * @see com.sr.freightops.entity.User
 * @author Hibernate Tools
 */

@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	private static final Logger log = Logger.getLogger(UserDaoImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sr.freightops.dao.UserDao#update(com.sr.freightops.entity.User)
	 */
	@Override
	public void updateUser(User user) {
		log.debug("updating a new User");
		try {
			Authentication auth = SecurityContextHolder.getContext()
					.getAuthentication();
			String updatedBy = auth.getName(); // get logged in username
			user.setUpdatedBy(updatedBy);
			user.setDateUpdated(new Date());
			getHibernateTemplate().saveOrUpdate(user);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sr.freightops.dao.UserDao#addUser(com.sr.freightops.entity.User)
	 */
	@Override
	public void addUser(User user) {
		log.debug("adding a new User");
		try {
			Authentication auth = SecurityContextHolder.getContext()
					.getAuthentication();
			String createdBy = auth.getName(); // get logged in username
			user.setCreatedBy(createdBy);
			user.setDateCreated(new Date());
			getHibernateTemplate().save(user);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sr.freightops.dao.UserDao#delete(com.sr.freightops.entity.User)
	 */
	@Override
	public void deleteUser(User user) {
		log.debug("deleting a User");
		try {
			getHibernateTemplate().delete(user);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sr.freightops.dao.UserDao#findById(java.lang.String)
	 */
	@Override
	public User findUserById(String id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getHibernateTemplate().getSessionFactory()
					.getCurrentSession().get(User.class, id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sr.freightops.dao.UserDao#findByExample(com.sr.freightops.entity.User)
	 */
	@Override
	public List<User> findUserByExample(User user) {
		log.debug("finding User instance by example");
		try {
			List<User> results = (List<User>) getHibernateTemplate()
					.getSessionFactory().getCurrentSession()
					.createCriteria(User.class).add(create(user))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sr.freightops.dao.UserDao#findAllCustomer()
	 */
	@Override
	public List<User> findAllUser() {
		log.debug("finding all User");
		try {
			List<User> users = getHibernateTemplate().getSessionFactory()
			.getCurrentSession().createQuery("from User").list();
//			for (User user : users) {				
//				Hibernate.initialize(user.getParameterByStatus());
//				Hibernate.initialize(user.getParameterByType());
//				Hibernate.initialize(user.getCustomer());
//				Hibernate.initialize(user.getGroup());
//			}
			return users;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}

	}
}
