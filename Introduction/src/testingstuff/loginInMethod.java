package testingstuff;

import java.util.Scanner;

public class loginInMethod {

	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	// 1 point for declaration 
	// 1 point for declaration of data type (String) 
	private static String username = "test_user";
	private static String password = "test";
	
	// 1 point correct method header
	public static void main(String[] args) {
		//user has 1 chance to enter names
		if(correctUser()){
			askPassword();
		}else{
			System.out.println("Unknow user name please contact admin");
		}
	
	}
	private static boolean correctUser() {
		//1 point comparing strings require .equals not ==
		System.out.println("Enter username");
		return waitForEntry().equals(username); 
			
	}
	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		//1 point using a loop
		while(inLoop){
			System.out.println("Enter your password");
			//1 point for using waitForEntry correctly
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("sucess");
				inLoop = false;
			}else{
				//.5 points 3 tries max
				//.5 points for saying invalid password after 3 tries 
				remainingTries --;
				//.5 points for stating a changing number
				//.5 points for the correct number regardless of exiting the loop
				System.out.println("Incorrect Password \n You have " + remainingTries + " tries left");
				
				if(remainingTries <= 0){
					System.out.println("Too many incorrect entries, system lockdown");
					inLoop = false;
				}
			}
		}
	}

}
