package exception;

public class CommunicationFailureException extends Exception{
	
	private static final long serialVersionUID = -4065263510772596192L;

	public CommunicationFailureException (String error){
		super(error);
	}
	
}
