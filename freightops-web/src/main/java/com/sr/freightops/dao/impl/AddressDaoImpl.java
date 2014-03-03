package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.AddressDao;
import com.sr.freightops.entity.Address;

/**
 * Home object for domain model class Address.
 * @see com.sr.freightops.dao.Address
 * @author Hibernate Tools
 */
@Transactional
public class AddressDaoImpl extends HibernateDaoSupport implements AddressDao{

	private static final Log log = LogFactory.getLog(AddressDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressDao#updateAddress(com.sr.freightops.entity.Address)
	 */
	@Override
	public void updateAddress(Address address) {
		log.debug("updating a new Address");
		try {			
			getHibernateTemplate().saveOrUpdate(address);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressDao#addAddress(com.sr.freightops.entity.Address)
	 */
	@Override
	public void addAddress(Address address) {
		log.debug("adding a new Address");
		try {			
			getHibernateTemplate().save(address);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressDao#deleteAddress(com.sr.freightops.entity.Address)
	 */
	@Override
	public void deleteAddress(Address address) {
		log.debug("deleting a Address");
		try {
			getHibernateTemplate().delete(address);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressDao#findByAddressId(java.lang.String)
	 */
	@Override
	public Address findByAddressId(java.lang.String id) {
		log.debug("getting Address instance with id: " + id);
		try {
			Address instance = (Address) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Address.class, id);
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
	 * @see com.sr.freightops.dao.AddressDao#findAddressByExample(com.sr.freightops.entity.Address)
	 */
	@Override
	public List<Address> findAddressByExample(Address instance) {
		log.debug("finding Address instance by example");
		try {
			List<Address> results = (List<Address>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Address.class)
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
