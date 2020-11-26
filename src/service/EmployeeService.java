package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	void deleteEmployee(int index);
	List<Employee> getAllEmployee();
}
