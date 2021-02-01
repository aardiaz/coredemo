package view;

import java.util.List;
import java.util.Scanner;

import model.CompareEmp;
import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class RunEmployee {

	public static void main(String[] args) {
		
		
		Employee  e1 = new Employee();
		e1.setFname("ram");
		
		Employee  e2 = new Employee();
		e2.setFname("ram");
		
	System.out.println(new CompareEmp().compare(e1, e2));
		
		
//		EmployeeService es = new EmployeeServiceImpl();
//		Scanner sc  = new Scanner(System.in);
//		
//		//============== add employee =========================
//				addEmp(es, sc);
//
//		//========== display all employee data =================
//				getAll(es);
//		
//		//============== delete employee data ==================
//				deleteEmp(es, sc);

	}

	private static void deleteEmp(EmployeeService es, Scanner sc) {
		System.out.println("which employee data want to delete?");
		es.deleteEmployee(sc.nextInt());
	     getAll(es);
	}

	private static void addEmp(EmployeeService es, Scanner sc) {
		char flag = 'y';
				
		do {
			
			Employee e = new Employee();
	
			System.out.println("Enter your id");
			e.setId(sc.nextInt());
			
			System.out.println("Enter your fname");
			e.setFname(sc.next());
			
			System.out.println("Enter your lname");
			e.setLname(sc.next());
			
			System.out.println("Enter company Name");
			e.setCompanyName(sc.next());
			
			System.out.println("Enter salary");
			e.setSalary(sc.nextInt());
			
			System.out.println("Enter phone");
			e.setPhone(sc.next());
			
			System.out.println("Enter email");
			e.setEmail(sc.next());
	
			es.addEmployee(e);
			System.out.println("do you want to continue[y/n]");
			flag = sc.next().charAt(0);
			
		}while(flag == 'Y' || flag == 'y');
	}

	private static void getAll(EmployeeService es) {
		List<Employee> elist= es.getAllEmployee();
		 
		for(Employee e : elist) {
			System.out.println(e);
		}
	}

}
