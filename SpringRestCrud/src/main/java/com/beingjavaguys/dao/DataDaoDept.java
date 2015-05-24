package com.beingjavaguys.dao;

import java.util.List;

import com.beingjavaguys.model.Department;
import com.beingjavaguys.model.Employee;

public interface DataDaoDept {
	public boolean addEntity(Department Department1) throws Exception;
	public Department getEntityById(long id) throws Exception;
	public List<Department> getEntityList() throws Exception;
	public boolean deleteEntity(long id)  throws Exception;
	
	
}
