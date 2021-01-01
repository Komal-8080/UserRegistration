package userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailValidation {	
	
	public static void main(String args[]) {	
		Pattern emailValidation = Pattern.compile("^([a-zA-a0-9\\.\\-\\+]+)@([a-zA-Z0-9\\.]{1,5})([a-zA-Z\\.]+){1,3}([a-zA-Z]{1,3})$");  
		Matcher match1 = emailValidation.matcher("abc@yahoo.com");
		Matcher match2 = emailValidation.matcher("abc-100@yahoo.com");
		Matcher match3 = emailValidation.matcher("abc.100@yahoo.com");
		Matcher match4 = emailValidation.matcher("abc111@abc.com");
		Matcher match5= emailValidation.matcher("abc-100@abc.net");
		Matcher match6= emailValidation.matcher("abc.100@abc.com.au");
		Matcher match7 = emailValidation.matcher("abc@1.com");
		Matcher match8 = emailValidation.matcher("abc@gmail.com.com");
		Matcher match9 = emailValidation.matcher("abc+100@gmail.com");
		boolean patternValidity1 = match1.matches();
		boolean patternValidity2 = match2.matches();
		boolean patternValidity3 = match3.matches();
		boolean patternValidity4 = match4.matches();
		boolean patternValidity5 = match5.matches();
		boolean patternValidity6 = match6.matches();
		boolean patternValidity7 = match7.matches();
		boolean patternValidity8 = match8.matches();
		boolean patternValidity9 = match9.matches();
		System.out.println(patternValidity1);
		System.out.println(patternValidity2);
		System.out.println(patternValidity3);
		System.out.println(patternValidity4);
		System.out.println(patternValidity5);
		System.out.println(patternValidity6);
		System.out.println(patternValidity7);
		System.out.println(patternValidity8);
		System.out.println(patternValidity9);
	}
}
