
public class StudentManager extends UserManager {
	public void returnTotalMarks(Student student) {
		System.out.println("Total Marks: "+ student.getTotalMarks());
	}
	@Override
	public void userList(User user) {
		System.out.println("Student List");
	}
	public void studentList(UserManager userManager, Student student) {
		System.out.println("Student List");
		userManager.userList(student);
		returnTotalMarks(student);
	}
}
