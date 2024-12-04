package Chipl.Eclipsespring;
public class School {
	int sname;
	String section;
	int marks;
	public School(int sname, String section, int marks) {
		super();
		this.sname = sname;
		this.section = section;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "School [sname=" + sname + ", section=" + section + ", marks=" + marks + "]";
	}
	
}
