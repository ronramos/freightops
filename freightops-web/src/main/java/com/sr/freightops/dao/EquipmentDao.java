package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Equipment;

public interface EquipmentDao {

	public void updateEquipment(Equipment equipment);

	public void addEquipment(Equipment equipment);

	public void deleteEquipment(Equipment equipment);

	public Equipment findByEquipmentId(java.lang.String id);

	public List<Equipment> findEquipmentByExample(Equipment instance);

}