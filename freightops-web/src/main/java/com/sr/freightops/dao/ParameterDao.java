package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Parameter;

public interface ParameterDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sr.freightops.dao.ParameterDao#updateParameter(com.sr.freightops.
	 * entity.Parameter)
	 */
	public void updateParameter(Parameter parameter);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sr.freightops.dao.ParameterDao#addParameter(com.sr.freightops.entity
	 * .Parameter)
	 */
	public void addParameter(Parameter parameter);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sr.freightops.dao.ParameterDao#deleteParameter(com.sr.freightops.
	 * entity.Parameter)
	 */
	public void deleteParameter(Parameter parameter);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sr.freightops.dao.ParameterDao#findByParameterId(java.lang.String)
	 */
	public Parameter findByParameterId(java.lang.String id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sr.freightops.dao.ParameterDao#findParameterByExample(com.sr.freightops
	 * .entity.Parameter)
	 */
	public List<Parameter> findParameterByExample(Parameter instance);

	public Parameter findParameterByKey(String key);

}