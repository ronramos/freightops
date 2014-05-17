package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.ParameterDao;
import com.sr.freightops.entity.Parameter;

/**
 * Home object for domain model class Parameter.
 * 
 * @see com.sr.freightops.dao.Parameter
 * @author Hibernate Tools
 */
@Transactional
public class ParameterDaoImpl extends HibernateDaoSupport implements
		ParameterDao {

	private static final Log log = LogFactory.getLog(ParameterDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.impl.ParameterDao#updateParameter(com.sr.freightops.entity.Parameter)
	 */
	@Override
	public void updateParameter(Parameter parameter) {
		log.debug("updating a new Parameter");
		try {
			getHibernateTemplate().saveOrUpdate(parameter);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.impl.ParameterDao#addParameter(com.sr.freightops.entity.Parameter)
	 */
	@Override
	public void addParameter(Parameter parameter) {
		log.debug("adding a new Parameter");
		try {
			getHibernateTemplate().save(parameter);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.impl.ParameterDao#deleteParameter(com.sr.freightops.entity.Parameter)
	 */
	@Override
	public void deleteParameter(Parameter parameter) {
		log.debug("deleting a Parameter");
		try {
			getHibernateTemplate().delete(parameter);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sr.freightops.dao.ParameterDao#findByParameterId(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.impl.ParameterDao#findByParameterId(java.lang.String)
	 */
	@Override
	public Parameter findByParameterId(java.lang.String id) {
		log.debug("getting Parameter instance with id: " + id);
		try {
			Parameter instance = (Parameter) getHibernateTemplate()
					.getSessionFactory().getCurrentSession()
					.get(Parameter.class, id);
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
	 * @see com.sr.freightops.dao.impl.ParameterDao#findParameterByExample(com.sr.freightops.entity.Parameter)
	 */
	@Override
	public List<Parameter> findParameterByExample(Parameter instance) {
		log.debug("finding Parameter instance by example");
		try {
			List<Parameter> results = (List<Parameter>) getHibernateTemplate()
					.getSessionFactory().getCurrentSession()
					.createCriteria(Parameter.class).add(create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.impl.ParameterDao#findParameterByKey(java.lang.String)
	 */
	@Override
	public Parameter findParameterByKey(String key) {
		log.debug("finding Parameter instance by key");
		try {
			Parameter parameter = new Parameter();
			parameter.setKey(key);
			List<Parameter> results = findParameterByExample(parameter);
			log.debug("find by key successful, result size: " + results.size());
			if (!results.isEmpty()) {
				return results.get(0);
			}
			return null;
		} catch (RuntimeException re) {
			log.error("find by key failed", re);
			throw re;
		}
	}
}
