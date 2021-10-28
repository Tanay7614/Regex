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
		 regex.validateMobileNo("91 9146777944");		
		 regex.password("passord");
		 regex.passwordAtleast1_uc_and_1_numeric_exactly1_spe_ch("Pass7#word");
		 regex.validateEmail("user202@yahho.com");
		
	}

}
