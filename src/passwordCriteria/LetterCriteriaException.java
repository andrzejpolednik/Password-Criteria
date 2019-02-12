package passwordCriteria;

public class LetterCriteriaException extends Exception{

	String password;
	
	public LetterCriteriaException(String password) {
		
		this.password = password;
	}
	
	public String toString() {
		return "LetterCriteriaException: " + password;
		
		
	}
	
	
	
}
