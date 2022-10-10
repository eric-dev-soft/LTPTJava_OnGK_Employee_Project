	package entity;

import java.util.Date;
import java.util.List;

public class Project {
	private int id;
	private String name;
	private String department;
	private String location;
	private Date startDate;
	private List<Assignment> assignments;
	
	public Project() {
		super();
	}

	public Project(int id, String name, String department, String location, Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.location = location;
		this.startDate = startDate;
	}

	public Project(int id, String name, String department, String location, Date startDate,
			List<Assignment> assignments) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.location = location;
		this.startDate = startDate;
		this.assignments = assignments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", department=" + department + ", location=" + location
				+ ", startDate=" + startDate + ", assignments=" + assignments + "]";
	}
}
