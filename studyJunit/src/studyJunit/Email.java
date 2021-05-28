package studyJunit;

public class Email {
	public boolean  validateEmail(String email)
	{
		if(email.contains("@")&& email.contains("."))
		{
			return true;
		}
		else return false;
	}
}
