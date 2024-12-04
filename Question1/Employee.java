package Chipl.Eclipsespring;

public class Employee {
	int id;
	String ename;
	String dept;
	int salary;
	public Employee(int id, String ename, String dept, int salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
