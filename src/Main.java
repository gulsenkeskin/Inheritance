
public class Main {

	public static void main(String[] args) {
		Student gulsen=new Student();
		gulsen.setId(1);
		gulsen.setFirstName("Gülsen");
		gulsen.setLastName("Keskin");
		gulsen.setDepartment("Yönetim Bilişim Sistemleri");
		gulsen.setTotalMarks(95);
		
		Instructor elif= new Instructor();
		elif.setId(1);
		elif.setFirstName("Elif");
		elif.setLastName("Haytaoğlu");
		elif.setDepartment("Bilgisayar Mühendisliği");
		elif.setAcademicDegree("Associate professor");
		
		Instructor sezai= new Instructor();
		sezai.setId(2);
		sezai.setFirstName("Sezai");
		sezai.setLastName("Tokat");
		sezai.setDepartment("Bilgisayar Mühendisliği");
		sezai.setAcademicDegree("Proffesor");
		
		UserManager userManager = new UserManager();
		userManager.add(elif);
		userManager.add(gulsen);
		
		
		User[] users= {elif,gulsen};
		userManager.addMultiple(users);
	
		InstructorManager instructorManager = new InstructorManager();
	    instructorManager.returnAcademicDegree(elif);
		
	    StudentManager studentManager= new StudentManager();
	    studentManager.returnTotalMarks(gulsen);
	    
	    System.out.println("************OVERRIDE*************");
	    userManager.userList(gulsen);
	    studentManager.userList(gulsen);
	    instructorManager.userList(elif);
	    System.out.println("-----------------------------------");
	    instructorManager.instructorList(userManager, elif);
	    System.out.println("-----------------------------------");
	    studentManager.studentList(userManager, gulsen);
	    System.out.println("-----------bulk list----------------");
		Instructor[] instructors= {elif,sezai};
	    instructorManager.bulkInstructorList(userManager, instructors);

	}

}
