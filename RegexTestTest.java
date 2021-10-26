package com.bridge;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RegexTestTest {

	@Test
	void givenValidRegistration()
	{
		 RegexTest regex=new  RegexTest();
		 regex.validateFirstName("Tanay");
		 regex.validateFirstName("Tanay");
		
	}

}
