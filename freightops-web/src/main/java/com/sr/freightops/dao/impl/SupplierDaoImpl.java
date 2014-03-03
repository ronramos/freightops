package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.SupplierDao;
import com.sr.freightops.entity.Supplier;

/**
 * Home object for domain model class Supplier.
 * @see com.sr.freightops.dao.Supplier
 * @author Hibernate Tools
 */
@Transactional
public class SupplierDaoImpl extends HibernateDaoSupport implements SupplierDao{

	private static final Log log = LogFactory.getLog(SupplierDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.SupplierDao#updateSupplier(com.sr.freightops.entity.Supplier)
	 */
	@Override
	public void updateSupplier(Supplier supplier) {
		log.debug("updating a new Supplier");
		try {			
			getHibernateTemplate().saveOrUpdate(supplier);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.SupplierDao#addSupplier(com.sr.freightops.entity.Supplier)
	 */
	@Override
	public void addSupplier(Supplier supplier) {
		log.debug("adding a new Supplier");
		try {			
			getHibernateTemplate().save(supplier);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.SupplierDao#deleteSupplier(com.sr.freightops.entity.Supplier)
	 */
	@Override
	public void deleteSupplier(Supplier supplier) {
		log.debug("deleting a Supplier");
		try {
			getHibernateTemplate().delete(supplier);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.SupplierDao#findBySupplierId(java.lang.String)
	 */
	@Override
	public Supplier findBySupplierId(java.lang.String id) {
		log.debug("getting Supplier instance with id: " + id);
		try {
			Supplier instance = (Supplier) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Supplier.class, id);
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
	 * @see com.sr.freightops.dao.SupplierDao#findSupplierByExample(com.sr.freightops.entity.Supplier)
	 */
	@Override
	public List<Supplier> findSupplierByExample(Supplier instance) {
		log.debug("finding Supplier instance by example");
		try {
			List<Supplier> results = (List<Supplier>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Supplier.class)
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
