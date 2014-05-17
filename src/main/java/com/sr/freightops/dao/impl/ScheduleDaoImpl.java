package com.sr.freightops.dao.impl;

// Generated Feb 13, 2014 10:55:38 AM by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sr.freightops.dao.ScheduleDao;
import com.sr.freightops.entity.Schedule;

/**
 * Home object for domain model class Schedule.
 * @see com.sr.freightops.dao.Schedule
 * @author Hibernate Tools
 */
@Transactional
public class ScheduleDaoImpl extends HibernateDaoSupport implements ScheduleDao{

	private static final Log log = LogFactory.getLog(ScheduleDaoImpl.class);

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ScheduleDao#updateSchedule(com.sr.freightops.entity.Schedule)
	 */
	@Override
	public void updateSchedule(Schedule schedule) {
		log.debug("updating a new Schedule");
		try {			
			getHibernateTemplate().saveOrUpdate(schedule);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ScheduleDao#addSchedule(com.sr.freightops.entity.Schedule)
	 */
	@Override
	public void addSchedule(Schedule schedule) {
		log.debug("adding a new Schedule");
		try {			
			getHibernateTemplate().save(schedule);
			log.debug("add successful");
		} catch (RuntimeException re) {
			log.error("add failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ScheduleDao#deleteSchedule(com.sr.freightops.entity.Schedule)
	 */
	@Override
	public void deleteSchedule(Schedule schedule) {
		log.debug("deleting a Schedule");
		try {
			getHibernateTemplate().delete(schedule);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.sr.freightops.dao.ScheduleDao#findByScheduleId(java.lang.String)
	 */
	@Override
	public Schedule findByScheduleId(java.lang.String id) {
		log.debug("getting Schedule instance with id: " + id);
		try {
			Schedule instance = (Schedule) getHibernateTemplate().getSessionFactory().getCurrentSession()
					.get(Schedule.class, id);
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
	 * @see com.sr.freightops.dao.ScheduleDao#findScheduleByExample(com.sr.freightops.entity.Schedule)
	 */
	@Override
	public List<Schedule> findScheduleByExample(Schedule instance) {
		log.debug("finding Schedule instance by example");
		try {
			List<Schedule> results = (List<Schedule>) getHibernateTemplate().getSessionFactory()
					.getCurrentSession()
					.createCriteria(Schedule.class)
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
