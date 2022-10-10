package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import dao.EmployeeDAO;
import dao.ProjectDAO;
import entity.Assignment;
import entity.Employee;
import entity.Project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO employeeDAO = new EmployeeDAO();
		ProjectDAO projectDAO = new ProjectDAO();
		
		Employee employee1 = new Employee("EE18096518", 
				"Phan", 
				"Phuc", 
				"Male", 
				"phuc@gmail.com", 
				Arrays.asList("09091231234", "09091231235"));
		
		Employee employee2 = new Employee("EE18096519", 
				"Phan", 
				"Thien", 
				"Male", 
				"thien@gmail.com", 
				Arrays.asList("09091231235", "09091231236"));
		
		Employee employee3 = new Employee("EE18096520", 
				"Phan", 
				"Nhien", 
				"Female", 
				"nhienphan@gmail.com", 
				Arrays.asList("09091231239", "09091231240"));
		/** EMPLOYEE */
		/** ADD */
//		boolean addEmployee = employeeDAO.addEmployee(employee);
//		System.out.println(addEmployee);
		
//		List<Boolean> listAdd = new ArrayList<Boolean>();
//		boolean addEmployees = employeeDAO.addManyEmployees(Arrays.asList(employee1, employee2, employee3));
//		listAdd.add(addEmployees);
//		for (Boolean booleanVal : listAdd) {			
//			int count = 0;
//			if (booleanVal) {
//				count++;
//			}	
//			System.out.println(count);
//		}
//		System.out.println(addEmployees);
		
		/** HoursInTotal */
		
		/** UPDATE */
//		boolean updateEmployee = employeeDAO.updateEmployee("EE18096520", employee3);
//		System.out.println(updateEmployee);
		
		/** PROJECT */
		/** ADD */
		Assignment assignment1 = new Assignment(100, employee1);
		Assignment assignment2 = new Assignment(120, employee2);
		Assignment assignment3 = new Assignment(150, employee3);
		Project project = new Project(18096504, 
				"Practice 3", 
				"IUH", 
				"HCM", 
				new Date(), 
				Arrays.asList(assignment1, assignment2, assignment3));
		boolean addProject = projectDAO.addProject(project);
		System.out.println(addProject);
	}

}
