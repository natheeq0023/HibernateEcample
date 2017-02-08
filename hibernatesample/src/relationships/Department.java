package relationships;

import java.util.Set;

public class Department {
	private int did;
	private String dname;
	private Set Students;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set getStudents() {
		return Students;
	}
	public void setStudents(Set students) {
		Students = students;
	}

}
