package Chipl.Eclipsespring;
public class Students {
	String sname;
	String section;
	int marks;
	String clgname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	@Override
	public String toString() {
		return "Students [sname=" + sname + ", section=" + section + ", marks=" + marks + ", clgname=" + clgname + "]";
	}
	
	
}

