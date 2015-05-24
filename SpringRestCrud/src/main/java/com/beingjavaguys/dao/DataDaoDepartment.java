package com.beingjavaguys.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.beingjavaguys.model.Department;
import com.beingjavaguys.model.Employee;

public class DataDaoDepartment implements DataDaoDept{

	@Autowired
	SessionFactory sessionFactory;
	Session session=null;
	Transaction tx=null;

	
	@Override
	public boolean addEntity(Department Department1) throws Exception {
		
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(Department1);
		tx.commit();
		session.close();

		return false;
	}
	
	@Override
	public Department getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Department Department1 = (Department) session.load(Department.class,new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return Department1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Department> DepartmentList = session.createCriteria(Department.class).list();
		tx.commit();
		session.close();
		return DepartmentList;
	}
	
	
	@Override
	public boolean deleteEntity(long id)  throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Department.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

		
 }
