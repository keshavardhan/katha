package com.beingjavaguys.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Entity
@Table(name="department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})


public class Department implements Serializable{
	
	@Id
	
	@Column(name="phone")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int phone;
	
	@Column(name="address")
	private String address;
	 
	@Column(name="zip")
	private int zip;
	
	@OneToMany(mappedBy="Department1")
	private Set<Employee> std;
/*
	public Set<Employee> getStd() {
		return std;
	}

	public void setStd(Set<Employee> std) {
		this.std = std;
	}
*/
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
