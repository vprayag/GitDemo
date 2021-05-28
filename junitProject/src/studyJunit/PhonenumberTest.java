package studyJunit;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhonenumberTest {

	PhoneNumber ph=new PhoneNumber();

		@Test(expected=NullPointerException.class)
		public void  testvalidatePhoneNumberNull() {
		boolean result=ph.validatePhoneNumberLength(null);
		assertTrue(result);
		}
		
		@Test()
		public void  testvalidatePhoneNumberLength() {
		boolean result=ph.validatePhoneNumberLength("9881141124");
		assertTrue(result);
		}
		
		@Test
		public void testvalidatePhoneNumberInts() {
		boolean result=ph.validatePhoneNumberInt("988abc1");
		assertTrue(result);
		
	}

}
