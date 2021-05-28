package studyJunit;

public class PhoneNumber {
	
	boolean validatePhoneNumberLength(String phNumber)
	{
		if(phNumber.length()==10)
		
			
			
			return true;
		
	
		else
			return false;
	}
	
	boolean validatePhoneNumberInt(String phNumber)
	{

	try {
		Integer.parseInt(phNumber);
		return true;
	}catch(NumberFormatException e)
	{
		return false;
	}
	
	}

}
