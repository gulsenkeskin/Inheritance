
public class Instructor extends User {
	private String academicDegree;
	
	public Instructor() {
		
	}
	public Instructor(String academicDegree) {
		super();
		this.academicDegree = academicDegree;
	}
	public String getAcademicDegree() {
		return academicDegree;
	}
	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}
}
