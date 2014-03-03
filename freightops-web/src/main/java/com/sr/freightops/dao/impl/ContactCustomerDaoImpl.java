package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.ContactCustomerDao;
import com.sr.freightops.entity.ContactCustomer;

/**
 * Home object for domain model class ContactCustomer.
 * @see com.sr.freightops.dao.ContactCustomer
 * @author Hibernate Tools
 */
@Transactional
public class ContactCustomerDaoImpl extends HibernateDaoSupport implements ContactCustomerDao{

	private static final Log log = LogFactory.getLog(ContactCustomerDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactCustomerDao#updateContactCustomer(com.sr.freightops.entity.ContactCustomer)
	 */
	@Override
	public void updateContactCustomer(ContactCustomer contactCustomer) {
		log.debug("updating a new ContactCustomer");
		try {			
			getHibernateTemplate().saveOrUpdate(contactCustomer);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactCustomerDao#addContactCustomer(com.sr.freightops.entity.ContactCustomer)
	 */
	@Override
	public void addContactCustomer(ContactCustomer contactCustomer) {
		log.debug("adding a new ContactCustomer");
		try {			
			getHibernateTemplate().save(contactCustomer);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactCustomerDao#deleteContactCustomer(com.sr.freightops.entity.ContactCustomer)
	 */
	@Override
	public void deleteContactCustomer(ContactCustomer contactCustomer) {
		log.debug("deleting a ContactCustomer");
		try {
			getHibernateTemplate().delete(contactCustomer);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactCustomerDao#findByContactCustomerId(java.lang.String)
	 */
	@Override
	public ContactCustomer findByContactCustomerId(java.lang.String id) {
		log.debug("getting ContactCustomer instance with id: " + id);
		try {
			ContactCustomer instance = (ContactCustomer) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(ContactCustomer.class, id);
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
	 * @see com.sr.freightops.dao.ContactCustomerDao#findContactCustomerByExample(com.sr.freightops.entity.ContactCustomer)
	 */
	@Override
	public List<ContactCustomer> findContactCustomerByExample(ContactCustomer instance) {
		log.debug("finding ContactCustomer instance by example");
		try {
			List<ContactCustomer> results = (List<ContactCustomer>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(ContactCustomer.class)
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
