package com.collection.sort;

public class Employee implements Comparable<Employee>{

	
	public Integer id;
	public String empName;
	
	public Employee(String empName,Integer id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.empName = empName;
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		if(this.id == arg0.id){
			return 0;
		}
		return this.id > arg0.id ? 1: -1;
	}

}
