package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.beingjavaguys.dao.DataDao;
import com.beingjavaguys.model.Department;
import com.beingjavaguys.model.Employee;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		return dataDao.addEntity(employee);
	}
	
	/*public boolean addEntity1(Department Department1) throws Exception {
		return dataDao.addEntity1(Department1);
		
	}
	*/
	@Override
	public Employee getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}
	
	
	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
