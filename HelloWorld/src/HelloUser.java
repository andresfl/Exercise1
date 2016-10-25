
public class HelloUser {
	
	/**
	 * @author Florian
	 */

	private String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}
	
	public void greetUser() {
		System.out.println("Hello "+userName+"!");
	}
}
