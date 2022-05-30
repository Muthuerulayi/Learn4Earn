package com.learn4earn.assignments;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderRediff {
	
	@DataProvider(name = "dp")
	public static Object[][] getData(Method method) {
		
		switch(method.getName()) {
		case "launchWebsite":
			return new Object[][] {
				{"http://rediff.com"}
			};
		case "signIn":
			return new Object[][] {
				{"seleniumpanda@rediffmail.com", "Selenium@123"}, {"starvictory@test.com", "SayHappy11$"}
			};

		}
		
		return new Object[][]{{""}};

//		if(method.getName().equals("launchWebsite")) {
//			return new Object[][] {
//				{"http://rediff.com"}, {"http://google.com"}
//			};
//		}
//		else if(method.getName().equals("signIn")) {
//			return new Object[][] {
//				{"seleniumpanda@rediffmail.com", "Selenium@123"}, {"starvictory@test.com", "SayHappy11$"}
//			};
//		}
//		else {
//			return null;
//		}

	}

}
