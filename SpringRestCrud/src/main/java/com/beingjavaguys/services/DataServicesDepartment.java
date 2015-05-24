package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.beingjavaguys.dao.DataDaoDept;
import com.beingjavaguys.model.Department;
import com.beingjavaguys.model.Employee;

public class DataServicesDepartment implements DataServicesDept {
	
	@Autowired
	DataDaoDept datadaodept;
	
	@Override
	public boolean addEntity(Department Department1) throws Exception {
		return datadaodept.addEntity(Department1);
		
	}
	
	@Override
	public Department getEntityById(long id) throws Exception {
		return datadaodept.getEntityById(id);
	}

	@Override
	public List<Department> getEntityList() throws Exception {
		return datadaodept.getEntityList();
	}
	
	
	@Override
	public boolean deleteEntity(long id) throws Exception {
		return datadaodept.deleteEntity(id);
	}
	
	

}
