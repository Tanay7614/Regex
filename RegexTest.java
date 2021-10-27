package com.bridge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexTest {
        

		public void validateFirstName(String name)
		{
			 String regex="[A-Z]{1}[a-z]{2,8}";
        	 Pattern pattern=Pattern.compile(regex);
        	 Matcher matcher= pattern.matcher(name);
        	 System.out.println("String matches "+matcher.matches());
        }
		
		public void validateLastName(String name)
		{
			 String regex="[A-Z]{1}[a-z]{2,8}";
        	 Pattern pattern=Pattern.compile(regex);
        	 Matcher matcher= pattern.matcher(name);
        	 System.out.println("String matches "+matcher.matches());
        }
		
		public void validateEmail(String name)
		{
	     String regex= " ^[A-Za-z0-9+_.-]+@(.+)$";
       	 Pattern pattern=Pattern.compile(regex);
       	 Matcher matcher= pattern.matcher(name);
       	 System.out.println("String matches "+matcher.matches());
       	}
		
		public void validateMobileNo(String name) 
		{
			 String regex= "[9]{1}[1]{1}[\s]+[0-9]{10}";
	       	 Pattern pattern=Pattern.compile(regex);
	       	 Matcher matcher= pattern.matcher(name);
	       	 System.out.println("String matches "+matcher.matches());
			
		}



		
}
