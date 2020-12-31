package userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void FirstName() {
		System.out.println("Enter Valid First Name");
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(firstName); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred First Name is Valid");	
			}
			else {
				System.out.println("Entred first Name is Invalid");
			}
	}
	
	public static void LastName() {
		System.out.println("Enter Valid Last Name");
		Scanner input = new Scanner(System.in);
		String lastName = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(lastName); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred Last Name is Valid");	
			}
			else {
				System.out.println("Entred Last Name is Invalid");
			}
	}
	
	public static void Email() {
		System.out.println("Enter Valid Email");
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		Pattern pattern = Pattern.compile("^[a-zA-Z]{3}\\.[a-zA-Z]{1,}@[a-zA-Z]{2}\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,}$");
		Matcher match = pattern.matcher(email); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred Email is Valid");	
			}
			else {
				System.out.println("Entred Email is Invalid");
			}
	}
	
	public static void MobileNumber() {
		System.out.println("Enter Valid Mobile Number");
		Scanner input = new Scanner(System.in);
		String mobileNumber = input.nextLine();
		Pattern pattern = Pattern.compile("^[1-9]{2}\\s{1}[0-9]{1}[0-9]{9}$");
		Matcher match = pattern.matcher(mobileNumber); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred Mobile Number is Valid");	
			}
			else {
				System.out.println("Entred Mobile Number is Invalid");
			}
	}
		
	public static void main(String args[]) {
		FirstName();
		LastName();
		Email();
		MobileNumber();
		}
}
