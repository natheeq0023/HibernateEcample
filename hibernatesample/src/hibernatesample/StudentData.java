package hibernatesample;

import java.sql.Timestamp;

public class StudentData {
	private int stid;
	private String sname;
	private String marks;
	private int vid;
	private Timestamp tm;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	public Timestamp getTm() {
		return tm;
	}
	public void setTm(Timestamp tm) {
		this.tm = tm;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}

}
