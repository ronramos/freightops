package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.ContactSupplierDao;
import com.sr.freightops.entity.ContactSupplier;

/**
 * Home object for domain model class ContactSupplier.
 * @see com.sr.freightops.dao.ContactSupplier
 * @author Hibernate Tools
 */
@Transactional
public class ContactSupplierDaoImpl extends HibernateDaoSupport implements ContactSupplierDao{

	private static final Log log = LogFactory.getLog(ContactSupplierDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactSupplierDao#updateContactSupplier(com.sr.freightops.entity.ContactSupplier)
	 */
	@Override
	public void updateContactSupplier(ContactSupplier contactSupplier) {
		log.debug("updating a new ContactSupplier");
		try {			
			getHibernateTemplate().saveOrUpdate(contactSupplier);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactSupplierDao#addContactSupplier(com.sr.freightops.entity.ContactSupplier)
	 */
	@Override
	public void addContactSupplier(ContactSupplier contactSupplier) {
		log.debug("adding a new ContactSupplier");
		try {			
			getHibernateTemplate().save(contactSupplier);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactSupplierDao#deleteContactSupplier(com.sr.freightops.entity.ContactSupplier)
	 */
	@Override
	public void deleteContactSupplier(ContactSupplier contactSupplier) {
		log.debug("deleting a ContactSupplier");
		try {
			getHibernateTemplate().delete(contactSupplier);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactSupplierDao#findByContactSupplierId(java.lang.String)
	 */
	@Override
	public ContactSupplier findByContactSupplierId(java.lang.String id) {
		log.debug("getting ContactSupplier instance with id: " + id);
		try {
			ContactSupplier instance = (ContactSupplier) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(ContactSupplier.class, id);
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
	 * @see com.sr.freightops.dao.ContactSupplierDao#findContactSupplierByExample(com.sr.freightops.entity.ContactSupplier)
	 */
	@Override
	public List<ContactSupplier> findContactSupplierByExample(ContactSupplier instance) {
		log.debug("finding ContactSupplier instance by example");
		try {
			List<ContactSupplier> results = (List<ContactSupplier>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(ContactSupplier.class)
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
