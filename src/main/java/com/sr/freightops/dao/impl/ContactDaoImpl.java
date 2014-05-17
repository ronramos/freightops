package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.ContactDao;
import com.sr.freightops.entity.Contact;

/**
 * Home object for domain model class Contact.
 * @see com.sr.freightops.dao.Contact
 * @author Hibernate Tools
 */
@Transactional
public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao{

	private static final Log log = LogFactory.getLog(ContactDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactDao#updateContact(com.sr.freightops.entity.Contact)
	 */
	@Override
	public void updateContact(Contact contact) {
		log.debug("updating a new Contact");
		try {			
			getHibernateTemplate().saveOrUpdate(contact);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactDao#addContact(com.sr.freightops.entity.Contact)
	 */
	@Override
	public void addContact(Contact contact) {
		log.debug("adding a new Contact");
		try {			
			getHibernateTemplate().save(contact);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactDao#deleteContact(com.sr.freightops.entity.Contact)
	 */
	@Override
	public void deleteContact(Contact contact) {
		log.debug("deleting a Contact");
		try {
			getHibernateTemplate().delete(contact);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ContactDao#findByContactId(java.lang.String)
	 */
	@Override
	public Contact findByContactId(java.lang.String id) {
		log.debug("getting Contact instance with id: " + id);
		try {
			Contact instance = (Contact) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Contact.class, id);
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
	 * @see com.sr.freightops.dao.ContactDao#findContactByExample(com.sr.freightops.entity.Contact)
	 */
	@Override
	public List<Contact> findContactByExample(Contact instance) {
		log.debug("finding Contact instance by example");
		try {
			List<Contact> results = (List<Contact>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Contact.class)
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
