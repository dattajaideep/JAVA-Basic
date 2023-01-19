package com.day3.collections;

import java.util.Comparator;

import com.day2.relations.Employee;

public class MySalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
			return 1;
		else if(o1.getSalary()>o2.getSalary())
			return -1;
		else
		return 0;
	}
	
}
