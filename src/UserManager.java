
public class UserManager {
	public void add(User user) {
		System.out.println("User: "+ user.getFirstName() +" added");
	}
	
	//bulk insert
	public void addMultiple(User[] users) {
		for(User user: users) {
			System.out.println("Add Multiple");
			add(user);
		}
	}
	
	public void userList(User user) {
		System.out.println("First name: "+ user.getFirstName());
		System.out.println("Last name: "+ user.getLastName());
		System.out.println("National Identity: "+ user.getNationalIdentity());
		System.out.println("Email: "+ user.getEmail());
		System.out.println("Department: "+ user.getDepartment());
	}
	public void bulkUserList(User[] users) {
		for(User user: users) {
			userList(user);
			System.out.println("______________________________");
		}
	}
	

}
