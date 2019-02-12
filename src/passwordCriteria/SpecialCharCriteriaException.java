package passwordCriteria;

public class SpecialCharCriteriaException extends Exception{

	String password;
	
	public SpecialCharCriteriaException(String password) {
		
		this.password = password;
	}
	
	public String toString() {
		return "SpecialCharCriteriaException: " + password;
		
		
	}
	
	
	
}
