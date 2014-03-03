package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Group;

public interface GroupDao {

	public void updateGroup(Group group);

	public void addGroup(Group group);

	public void deleteGroup(Group group);

	public Group findByGroupId(java.lang.String id);

	public List<Group> findGroupByExample(Group instance);

}