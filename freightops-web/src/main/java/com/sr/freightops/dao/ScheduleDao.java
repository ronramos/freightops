package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Schedule;

public interface ScheduleDao {

	public void updateSchedule(Schedule schedule);

	public void addSchedule(Schedule schedule);

	public void deleteSchedule(Schedule schedule);

	public Schedule findByScheduleId(java.lang.String id);

	public List<Schedule> findScheduleByExample(Schedule instance);

}