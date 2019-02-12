package passwordCriteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteriaApp {

	public static void main(String[] args) {
		
		//Read a file of passwords
		
		String filename = "src/passwordCriteria/Passwords";
		
		String[] passwords = new String[13];
		
		File file = new File(filename);
		
		try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		for(int i =0; i < passwords.length; i++) {
			passwords[i] = br.readLine();
		}
	} catch (FileNotFoundException e) {
			System.out.println("Error: Cannot find the file");
			e.printStackTrace();
	} catch (IOException e) {
			System.out.println("Error: Could not read the file");
			e.printStackTrace();
		}
		
		//Test against our criteria
		
		for (String password : passwords) {
			System.out.println("*********\n" + password);
			
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			
			for(int n= 0; n< password.length(); n++) {
			//Condition 1: contains number
				if ("0123456789".contains(password.substring(n, n+1))) {
					hasNumber = true;
				}
			//Condition 2: contains letter
				else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n+1).toLowerCase())) {
					hasLetter = true;
				}
			//Condition 3 : contains special character: ! @ # 
				else if ("!@#$%^&*-=+(){}".contains(password.substring(n, n+1))) {
					hasSpecialChar = true;
				}
				/*else {
					try {
						throw new InvalidCharacterException(password.substring(n, n+1));
					} catch (InvalidCharacterException e) {
						System.out.println(e.toString());	
						}
					}*/

			}

			// Exception handling
			try {
				if (!hasNumber) {throw new NumberCriteriaException(password);}
				else if (!!hasLetter) {throw new LetterCriteriaException(password);}
				else if (!hasSpecialChar) {throw new SpecialCharCriteriaException(password);}	
				else {System.out.println("Valid password"); }
				}
				catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
					System.out.println("Invalid password");
					System.out.println(e.toString());
				}
				
				
			}
			
			
		}
		
		
	}
	
	
	
	
	

