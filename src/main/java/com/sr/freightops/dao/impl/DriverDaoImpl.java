package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.DriverDao;
import com.sr.freightops.entity.Driver;

/**
 * Home object for domain model class Driver.
 * @see com.sr.freightops.dao.Driver
 * @author Hibernate Tools
 */
@Transactional
public class DriverDaoImpl extends HibernateDaoSupport implements DriverDao{

	private static final Log log = LogFactory.getLog(DriverDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.DriverDao#updateDriver(com.sr.freightops.entity.Driver)
	 */
	@Override
	public void updateDriver(Driver driver) {
		log.debug("updating a new Driver");
		try {			
			getHibernateTemplate().saveOrUpdate(driver);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.DriverDao#addDriver(com.sr.freightops.entity.Driver)
	 */
	@Override
	public void addDriver(Driver driver) {
		log.debug("adding a new Driver");
		try {			
			getHibernateTemplate().save(driver);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.DriverDao#deleteDriver(com.sr.freightops.entity.Driver)
	 */
	@Override
	public void deleteDriver(Driver driver) {
		log.debug("deleting a Driver");
		try {
			getHibernateTemplate().delete(driver);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.DriverDao#findByDriverId(java.lang.String)
	 */
	@Override
	public Driver findByDriverId(java.lang.String id) {
		log.debug("getting Driver instance with id: " + id);
		try {
			Driver instance = (Driver) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Driver.class, id);
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

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.DriverDao#findDriverByExample(com.sr.freightops.entity.Driver)
	 */
	@Override
	public List<Driver> findDriverByExample(Driver instance) {
		log.debug("finding Driver instance by example");
		try {
			List<Driver> results = (List<Driver>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Driver.class)
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
