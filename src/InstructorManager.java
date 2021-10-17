
public class InstructorManager extends UserManager {
	public void returnAcademicDegree(Instructor instructor) {
		System.out.println("Acedemic degree: "+ instructor.getAcademicDegree());
	}
	@Override
	public void userList(User user) {
		System.out.println("Instructor List");

	}
	public void instructorList(UserManager userManager, Instructor instructor) {
		System.out.println("Instructor List");
		userManager.userList(instructor);
		returnAcademicDegree(instructor);
	}
	public void bulkInstructorList(UserManager userManager, Instructor[] instructors) {
		System.out.println("Instructor List");
		userManager.bulkUserList(instructors);
		for(Instructor instructor: instructors) {
			returnAcademicDegree(instructor);
		}
	}
}
