package passwordCriteria;

public class InvalidCharacterException extends Exception{
	
	String character;
	
	public InvalidCharacterException (String character) {
		
		this.character = character;
	}
	
	public String toString() {
		
		return "InvalidCharacterException " + character;
	}

}
