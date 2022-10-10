package dao;

import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.client.result.InsertOneResult;

import db.DBConnection;
import db.Mapper;
import entity.Employee;

public class EmployeeDAO {
	private static final String DB_NAME = "phuc18096501";

	private static final String COLLECTION_NAME = "employees";
	
	private MongoCollection<Document> employeeDoc;

	public EmployeeDAO() {
		employeeDoc = DBConnection.getInstance()
				.getMongoClient()
				.getDatabase(DB_NAME)
				.getCollection(COLLECTION_NAME);
	}
	
	public boolean addEmployee(Employee employee) {
		Document doc = Mapper.EmployeeToDocument(employee);
		InsertOneResult result = employeeDoc.insertOne(doc);
		
		return result.getInsertedId() != null;
	}
	
	public boolean addManyEmployees(List<Employee> employees) {
		List<Document> docs = Mapper.ListEmployeeToDocument(employees);
		InsertManyResult result = employeeDoc.insertMany(docs);
		
		return result.getInsertedIds() != null;
	}
	
	public boolean updateEmployee(String employeeId, Employee newEmployee) {
		employeeId = newEmployee.getId();
		Document doc = Mapper.EmployeeToDocument(newEmployee);
		Document result = employeeDoc.findOneAndReplace(Filters.eq("_id", employeeId), doc);
		
		return result != null;
	}
}
