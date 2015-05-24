package com.beingjavaguys.services;

import java.util.List;

import com.beingjavaguys.model.Department;

public interface DataServicesDept {
	
	public boolean addEntity(Department Department1) throws Exception;


	public Department getEntityById(long id) throws Exception;
	public List<Department> getEntityList() throws Exception;
	
	
	public boolean deleteEntity(long id) throws Exception;

}
