package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.CustomerDao;
import com.sr.freightops.entity.Customer;

/**
 * Home object for domain model class Customer.
 * @see com.sr.freightops.dao.Customer
 * @author Hibernate Tools
 */
@Transactional
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	private static final Log log = LogFactory.getLog(CustomerDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.CustomerDao#updateCustomer(com.sr.freightops.entity.Customer)
	 */
	@Override
	public void updateCustomer(Customer customer) {
		log.debug("updating a new Customer");
		try {			
			getHibernateTemplate().saveOrUpdate(customer);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.CustomerDao#addCustomer(com.sr.freightops.entity.Customer)
	 */
	@Override
	public void addCustomer(Customer customer) {
		log.debug("adding a new Customer");
		try {			
			getHibernateTemplate().save(customer);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.CustomerDao#deleteCustomer(com.sr.freightops.entity.Customer)
	 */
	@Override
	public void deleteCustomer(Customer customer) {
		log.debug("deleting a Customer");
		try {
			getHibernateTemplate().delete(customer);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.CustomerDao#findByCustomerId(java.lang.String)
	 */
	@Override
	public Customer findByCustomerId(java.lang.String id) {
		log.debug("getting Customer instance with id: " + id);
		try {
			Customer instance = (Customer) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Customer.class, id);
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
	 * @see com.sr.freightops.dao.CustomerDao#findCustomerByExample(com.sr.freightops.entity.Customer)
	 */
	@Override
	public List<Customer> findCustomerByExample(Customer instance) {
		log.debug("finding Customer instance by example");
		try {
			List<Customer> results = (List<Customer>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Customer.class)
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
