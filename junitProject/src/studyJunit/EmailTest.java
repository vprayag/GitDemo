package studyJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailTest {

Email email=new Email();
	
	@Test()
	
	public void testValidateEmail() {
		boolean result = email.validateEmail("vidsk47@gmailcom");
		assertTrue(result);
	}

}
