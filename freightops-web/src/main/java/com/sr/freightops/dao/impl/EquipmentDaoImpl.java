package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.EquipmentDao;
import com.sr.freightops.entity.Equipment;

/**
 * Home object for domain model class Equipment.
 * @see com.sr.freightops.dao.Equipment
 * @author Hibernate Tools
 */
@Transactional
public class EquipmentDaoImpl extends HibernateDaoSupport implements EquipmentDao{

	private static final Log log = LogFactory.getLog(EquipmentDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.EquipmentDao#updateEquipment(com.sr.freightops.entity.Equipment)
	 */
	@Override
	public void updateEquipment(Equipment equipment) {
		log.debug("updating a new Equipment");
		try {			
			getHibernateTemplate().saveOrUpdate(equipment);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.EquipmentDao#addEquipment(com.sr.freightops.entity.Equipment)
	 */
	@Override
	public void addEquipment(Equipment equipment) {
		log.debug("adding a new Equipment");
		try {			
			getHibernateTemplate().save(equipment);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.EquipmentDao#deleteEquipment(com.sr.freightops.entity.Equipment)
	 */
	@Override
	public void deleteEquipment(Equipment equipment) {
		log.debug("deleting a Equipment");
		try {
			getHibernateTemplate().delete(equipment);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.EquipmentDao#findByEquipmentId(java.lang.String)
	 */
	@Override
	public Equipment findByEquipmentId(java.lang.String id) {
		log.debug("getting Equipment instance with id: " + id);
		try {
			Equipment instance = (Equipment) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Equipment.class, id);
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
	 * @see com.sr.freightops.dao.EquipmentDao#findEquipmentByExample(com.sr.freightops.entity.Equipment)
	 */
	@Override
	public List<Equipment> findEquipmentByExample(Equipment instance) {
		log.debug("finding Equipment instance by example");
		try {
			List<Equipment> results = (List<Equipment>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Equipment.class)
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
