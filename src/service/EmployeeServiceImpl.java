package service;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	static List<Employee>  empList = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee emp) {
		
		empList.add(emp);
		System.out.println("Size of arrayList = "+empList.size());
		
	}

	@Override
	public void deleteEmployee(int index) {
		
		empList.remove(index);
		System.out.println("size of arrayList after delete = "+empList.size());
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empList;
	}

}
