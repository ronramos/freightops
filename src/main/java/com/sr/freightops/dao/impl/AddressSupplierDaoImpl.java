package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.AddressSupplierDao;
import com.sr.freightops.entity.AddressSupplier;

/**
 * Home object for domain model class AddressSupplier.
 * @see com.sr.freightops.dao.AddressSupplier
 * @author Hibernate Tools
 */
@Transactional
public class AddressSupplierDaoImpl extends HibernateDaoSupport implements AddressSupplierDao{

	private static final Log log = LogFactory.getLog(AddressSupplierDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressSupplierDao#updateAddressSupplier(com.sr.freightops.entity.AddressSupplier)
	 */
	@Override
	public void updateAddressSupplier(AddressSupplier addressSupplier) {
		log.debug("updating a new AddressSupplier");
		try {			
			getHibernateTemplate().saveOrUpdate(addressSupplier);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressSupplierDao#addAddressSupplier(com.sr.freightops.entity.AddressSupplier)
	 */
	@Override
	public void addAddressSupplier(AddressSupplier addressSupplier) {
		log.debug("adding a new AddressSupplier");
		try {			
			getHibernateTemplate().save(addressSupplier);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressSupplierDao#deleteAddressSupplier(com.sr.freightops.entity.AddressSupplier)
	 */
	@Override
	public void deleteAddressSupplier(AddressSupplier addressSupplier) {
		log.debug("deleting a AddressSupplier");
		try {
			getHibernateTemplate().delete(addressSupplier);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.AddressSupplierDao#findByAddressSupplierId(java.lang.String)
	 */
	@Override
	public AddressSupplier findByAddressSupplierId(java.lang.String id) {
		log.debug("getting AddressSupplier instance with id: " + id);
		try {
			AddressSupplier instance = (AddressSupplier) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(AddressSupplier.class, id);
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
	 * @see com.sr.freightops.dao.AddressSupplierDao#findAddressSupplierByExample(com.sr.freightops.entity.AddressSupplier)
	 */
	@Override
	public List<AddressSupplier> findAddressSupplierByExample(AddressSupplier instance) {
		log.debug("finding AddressSupplier instance by example");
		try {
			List<AddressSupplier> results = (List<AddressSupplier>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(AddressSupplier.class)
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
