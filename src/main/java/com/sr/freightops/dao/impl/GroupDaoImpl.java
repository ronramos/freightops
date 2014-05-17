package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.GroupDao;
import com.sr.freightops.entity.Group;

/**
 * Home object for domain model class Group.
 * @see com.sr.freightops.dao.Group
 * @author Hibernate Tools
 */
@Transactional
public class GroupDaoImpl extends HibernateDaoSupport implements GroupDao{

	private static final Log log = LogFactory.getLog(GroupDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.GroupDao#updateGroup(com.sr.freightops.entity.Group)
	 */
	@Override
	public void updateGroup(Group group) {
		log.debug("updating a new Group");
		try {			
			getHibernateTemplate().saveOrUpdate(group);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.GroupDao#addGroup(com.sr.freightops.entity.Group)
	 */
	@Override
	public void addGroup(Group group) {
		log.debug("adding a new Group");
		try {			
			getHibernateTemplate().save(group);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.GroupDao#deleteGroup(com.sr.freightops.entity.Group)
	 */
	@Override
	public void deleteGroup(Group group) {
		log.debug("deleting a Group");
		try {
			getHibernateTemplate().delete(group);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.GroupDao#findByGroupId(java.lang.String)
	 */
	@Override
	public Group findByGroupId(java.lang.String id) {
		log.debug("getting Group instance with id: " + id);
		try {
			Group instance = (Group) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Group.class, id);
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
	 * @see com.sr.freightops.dao.GroupDao#findGroupByExample(com.sr.freightops.entity.Group)
	 */
	@Override
	public List<Group> findGroupByExample(Group instance) {
		log.debug("finding Group instance by example");
		try {
			List<Group> results = (List<Group>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Group.class)
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
