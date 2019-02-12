package passwordCriteria;

public class NumberCriteriaException extends Exception {
	
	
	String password;
	
	public NumberCriteriaException(String password) {
		
		this.password = password;
	}
	
	public String toString() {
		return "NumberCriteriaException: " + password;
		
		
	}

}
