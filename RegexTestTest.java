package com.bridge;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RegexTestTest {

	@Test
	void givenValidRegistration()
	{
		 RegexTest regex=new  RegexTest();
		 regex.validateFirstName("Tanay");
		 regex.validateLastName("Rathod");
		 regex.validateEmail("user_name@domain.co.in");
		 regex.validateMobileNo("91 9146777944");		
		 regex.password("PassWord");		
	}

}
