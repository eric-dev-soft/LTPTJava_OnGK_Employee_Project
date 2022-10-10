package dao;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;

import db.DBConnection;
import db.Mapper;
import entity.Project;

public class ProjectDAO {
	private static final String DB_NAME = "phuc18096501";

	private static final String COLLECTION_NAME = "projects";
	
	private MongoCollection<Document> projectDoc;
	
	public ProjectDAO() {
		projectDoc = DBConnection.getInstance()
				.getMongoClient()
				.getDatabase(DB_NAME)
				.getCollection(COLLECTION_NAME);
	}
	
	public boolean addProject(Project project) {
		Document doc = Mapper.ProjectToDocument(project);
		InsertOneResult result = projectDoc.insertOne(doc);
		
		return result.getInsertedId() != null;
	}
}
