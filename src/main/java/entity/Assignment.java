package entity;

public class Assignment {
	private int hours;
	private Employee employee;
	
//	public Assignment() {
//		super();
//	}
//
//	public Assignment(int hours, String employeeId) {
//		super();
//		this.hours = hours;
//		this.employeeId = employeeId;
//	}
//
//	public int getHours() {
//		return hours;
//	}
//
//	public void setHours(int hours) {
//		this.hours = hours;
//	}
//
//	public String getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	@Override
//	public String toString() {
//		return "Assignment [hours=" + hours + ", employeeId=" + employeeId + "]";
//	}
	
	
	public Assignment() {
		super();
	}

	public Assignment(int hours) {
		super();
		this.hours = hours;
	}
	
	public Assignment(int hours, Employee employee) {
		super();
		this.hours = hours;
		this.employee = employee;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Assignment [hours=" + hours + ", employee=" + employee + "]";
	}
	
}
