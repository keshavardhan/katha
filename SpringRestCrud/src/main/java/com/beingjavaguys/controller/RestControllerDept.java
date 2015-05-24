package com.beingjavaguys.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beingjavaguys.model.Department;
import com.beingjavaguys.model.Status;
import com.beingjavaguys.services.DataServices;
import com.beingjavaguys.services.DataServicesDepartment;
import com.beingjavaguys.services.DataServicesDept;


@Controller
@RequestMapping("/department")
public class RestControllerDept {
	
	@Autowired
	DataServicesDept dataServicesdept;

	static final Logger logger = Logger.getLogger(RestControllerDept.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody Department Department1) {
		try {
			dataServicesdept.addEntity(Department1);
			return new Status(1, "Department added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Department getEmployee(@PathVariable("id") long id) {
		Department employee = null;
		try {
			employee = dataServicesdept.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Department> getEmployee() {

		List<Department> employeeList = null;
		try {
			employeeList = dataServicesdept.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteDepartment(@PathVariable("id") long id) {

		try {
			dataServicesdept.deleteEntity(id);
			return new Status(1, "Employee deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}


}
