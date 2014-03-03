package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.AddressCustomerDao;
import com.sr.freightops.entity.AddressCustomer;

/**
 * Home object for domain model class AdressCustomer.
 * @see com.sr.freightops.dao.AddressCustomer
 * @author Hibernate Tools
 */
@Transactional
public class AddressCustomerDaoImpl extends HibernateDaoSupport implements AddressCustomerDao{

	private static final Log log = LogFactory.getLog(AddressCustomerDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressCustomerDao#updateAddressCustomer(com.sr.freightops.entity.AddressCustomer)
	 */
	@Override
	public void updateAddressCustomer(AddressCustomer addressCustomer) {
		log.debug("updating a new AddressCustomer");
		try {			
			getHibernateTemplate().saveOrUpdate(addressCustomer);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressCustomerDao#addAddressCustomer(com.sr.freightops.entity.AddressCustomer)
	 */
	@Override
	public void addAddressCustomer(AddressCustomer addressCustomer) {
		log.debug("adding a new AddressCustomer");
		try {			
			getHibernateTemplate().save(addressCustomer);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressCustomerDao#deleteAddressCustomer(com.sr.freightops.entity.AddressCustomer)
	 */
	@Override
	public void deleteAddressCustomer(AddressCustomer addressCustomer) {
		log.debug("deleting a AddressCustomer");
		try {
			getHibernateTemplate().delete(addressCustomer);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressCustomerDao#findByAddressCustomerId(java.lang.String)
	 */
	@Override
	public AddressCustomer findByAddressCustomerId(java.lang.String id) {
		log.debug("getting AddressCustomer instance with id: " + id);
		try {
			AddressCustomer instance = (AddressCustomer) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(AddressCustomer.class, id);
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
	 * @see com.sr.freightops.dao.AddressCustomerDao#findAddressCustomerByExample(com.sr.freightops.entity.AddressCustomer)
	 */
	@Override
	public List<AddressCustomer> findAddressCustomerByExample(AddressCustomer instance) {
		log.debug("finding AddressCustomer instance by example");
		try {
			List<AddressCustomer> results = (List<AddressCustomer>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(AddressCustomer.class)
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
