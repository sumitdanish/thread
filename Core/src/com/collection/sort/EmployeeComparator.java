package com.collection.sort;

import java.util.Comparator;

public class EmployeeComparator{
	
	public EmployeeComparator(Integer id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer id;
	public String name;
	public String lastName;
}

class SortComparator implements Comparator<EmployeeComparator>{

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}
	
}
