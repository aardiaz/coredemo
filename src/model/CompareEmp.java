package model;

import java.util.Comparator;

public class CompareEmp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		 
		if(o1.getFname().equals(o2.getFname())) {
			
		  return 1;
		}
		
		return 0;
	}

	 
	
	

}
