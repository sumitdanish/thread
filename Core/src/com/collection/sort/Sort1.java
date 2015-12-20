package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort1 {
	public static void main(String[] args){
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("sumit",1));
		l.add(new Employee("sumit12",19));
		l.add(new Employee("sumit31",4));
		l.add(new Employee("sumit09",89));
		l.add(new Employee("sumit09",8));
		System.out.println("Unsorted List");
		for(Employee e : l){
			System.out.println(e.getEmpName()+" > "+e.getId());
		}
		System.out.println("Sorted List--------------------");
		Collections.sort(l); 
		for(Employee e : l){
			System.out.println(e.getEmpName()+" > "+e.getId());
		}
	}
}
