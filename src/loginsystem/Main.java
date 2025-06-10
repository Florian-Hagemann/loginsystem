package loginsystem;

/*
 * Loginsystem
 * 
 * simple login screen with GUI
 * able to create and login to accounts
 * 
 * Date: 041021
 * Author: Florian
 */

public class Main {

	public static void main(String[] args) {
		
		GUI e;
		e = new GUI("e", 320, 180);
		
	}
	
	// SignIn logic
	public static boolean signin(String name, String password) {
		if(FileIO.exists(name)) {
			return false;
		}
		FileIO.output(name, password);
		return true;
		
	}
	
	// Login logic
	public static boolean login(String name, String password) {
		try {
			if(password.equals(FileIO.input(name))) {
				return true;
				
			}
			
			return false;
		} catch(Exception e) {
			return false;
		}
		
	}

}
