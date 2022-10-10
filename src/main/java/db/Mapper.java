package db;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import entity.Assignment;
import entity.Employee;
import entity.Project;

public class Mapper {
	public static Document EmployeeToDocument(Employee employee) {
		List<String> phones = employee.getPhones();
		List<Document> docPhones = new ArrayList<Document>();
		for (String phone : phones) {
			docPhones.add(new Document("phoneNumber", phone));
		}
		
		Document doc = new Document("_id", employee.getId())
										.append("firstName", employee.getFirstName())
										.append("lastName", employee.getLastName())
										.append("gender", employee.getGender())
										.append("email", employee.getEmail())
										.append("phoneNumbers", docPhones);
		
		return doc;
	}
	
	public static List<Document> ListEmployeeToDocument(List<Employee> employees) {
		List<Document> docs = new ArrayList<Document>();
		for (Employee employee : employees) {
			List<String> phones = employee.getPhones();
			List<Document> docPhones = new ArrayList<Document>();
			for (String phone : phones) {
				docPhones.add(new Document("phoneNumber", phone));
			}
			
			Document doc = new Document("_id", employee.getId())
											.append("firstName", employee.getFirstName())
											.append("lastName", employee.getLastName())
											.append("gender", employee.getGender())
											.append("email", employee.getEmail())
											.append("phoneNumbers", employee.getPhones()); //k thêm key object
//											.append("phoneNumbers", docPhones); //thêm key object
			
			docs.add(doc);
		}
		return (List<Document>) docs;
	}
	
//	List<String> phones = employee.getPhones();
//	List<Document> docPhones = new ArrayList<Document>();
//	for (String phone : phones) {
//		docPhones.add(new Document("phoneNumber", phone));
//	}
//	
//	Document doc = new Document("_id", employee.getId())
//									.append("firstName", employee.getFirstName())
//									.append("lastName", employee.getLastName())
//									.append("gender", employee.getGender())
//									.append("email", employee.getEmail())
//									.append("phoneNumbers", docPhones);
//	
//	return doc;
	
	public static Document ProjectToDocument(Project project) {
		List<Assignment> assignments = project.getAssignments();
		List<Document> assignmentDocs = new ArrayList<Document>();
		//Employee employee = new Employee();
		for (Assignment assignment : assignments) {
			assignmentDocs.add(new Document("hours", assignment.getHours())
					.append("employeeId", assignment.getEmployee().getId()));
		}
		
		Document projectDoc = new Document("_id", project.getId())
											.append("name", project.getName())
											.append("location", project.getLocation())
											.append("department", project.getDepartment())
											.append("startDate", project.getStartDate())
											.append("assignedEmployees", assignmentDocs);
		System.out.println(projectDoc);
		return projectDoc;
	}
}
