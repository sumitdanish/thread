package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeComparator>  empL = new ArrayList<EmployeeComparator>();
		empL.add(new EmployeeComparator(1, "Sumit", "Kumar32"));
		empL.add(new EmployeeComparator(11, "Sumit23", "Kumar321"));
		empL.add(new EmployeeComparator(15, "Sumit5", "Kumar2"));
		empL.add(new EmployeeComparator(19, "Sumit1", "Kumar90"));
		empL.add(new EmployeeComparator(20, "Sumit321", "Kumar1"));
		System.out.println("Before Sorting .........");
		for(EmployeeComparator e : empL){
			System.out.println(e.getId()+" >"+e.getName()+" >> "+e.getLastName());
		}
		Collections.sort(empL,new SortComparator());
		System.out.println("After Sorting...");
		for(EmployeeComparator e : empL){
			System.out.println(e.getId()+" >"+e.getName()+" >> "+e.getLastName());
		}
	}

}
