package labnumber7;

import java.util.Scanner;

public class Validatorlabnumber7 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		
		boolean validateName = validateName(scnr,"Please enter a valid name: ");
		boolean validateEmail =validateEmails(scnr,"Please enter a valid email: ");
		boolean validatePhonenumber =validatePhonenumbers(scnr,"Please enter a valid phone number: ");
		boolean validateDate = validateDate(scnr,"Please enter a valid date:");
			
	}
	
	public static boolean validateName(Scanner scnr, String prompt){
		boolean isValid = false;
		String input;
		do {
		
			System.out.println(prompt);
			input = scnr.nextLine();
			if (input.matches("[A-Z][a-z]{1,29}")) {
				isValid = true;
				System.out.println("Got a valid name");
			} else {
			   System.out.println("Sorry,name is not valid");
				isValid = false;
			}
			
		} while (!isValid);
		return isValid;
	}
	public static boolean validateEmails(Scanner scnr,String prompt){
		boolean isValid = false;
		String input;
		do{
			System.out.println(prompt);
			input = scnr.nextLine();
			if(input.matches("[A-Za-z(0-9)]{5,30}@[A-Za-z(0-9)]{5,10}.[A-Za-z(0-9)]{2,3}")){
				isValid = true;
				System.out.println("Email is valid");
			} else {
				System.out.println("Email is not valid");
				isValid = false;
				
			}
		}while (!isValid);
		return isValid;
		
	}
	
	public static boolean validatePhonenumbers(Scanner scnr, String prompt){
		boolean isValid = false;
		String input;
		do{
			System.out.println(prompt);
			input = scnr.nextLine();
			if(input.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")){
				isValid = true;
				System.out.println("Phone number is valid");
			} else {
				System.out.println("Sorry,phone number is not valid");
				isValid = false;
				
			}
		}while (!isValid);
		return isValid;
	
	
     } 
	public static boolean validateDate(Scanner scnr,String prompt){
		boolean isValid = false;
		String input;
		do{
			System.out.println(prompt);
			input = scnr.nextLine();
			if(input.matches("\\d{2}[/]\\d{2}[/]\\d{4}")){
				isValid = true;
				System.out.println("Date is valid");
			} else {
				System.out.println("Sorry, date is not valid");
				isValid = false;
				
			}
		}while (!isValid);
		return isValid;
	
} 
	
	
}