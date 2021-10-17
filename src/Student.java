
public class Student extends User{
    private int totalMarks;
     
    public Student() {
    	
    }
	public Student(int totalMarks) {
		super();
		this.totalMarks = totalMarks;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
}
