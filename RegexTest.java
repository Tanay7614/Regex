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
        		 System.out.println("String matches last name "+matcher.matches());
		}
		public void Email(String email)
		{
			 String regex= "([a]{1}+)([b]{1}+)([c]{1}+)(\\.[a-z]+)@([b]{1}+)([l]{1}+)((\\.[c]{1}+)([o]{1}))(\\.[a-z]{2})?$";
			 Pattern pattern=Pattern.compile(regex);
			 Matcher matcher= pattern.matcher(email);
	       		 System.out.println("String matches "+matcher.matches());
			
		}
}
