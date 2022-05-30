package com.learn4earn.dataprovider;

import org.testng.annotations.Test;

public class MultipleTestCases {
	
	@Test(priority = 1, dataProviderClass = DataProviderClass.class, dataProvider = "getData")
	public void launchUrl(String userName, String browser, String numId, int userId) {
		
		System.out.println(userName + " " + browser + " " + numId + " " + userId);
		
	}

	@Test(priority = 2, dataProviderClass = DataProviderClass.class, dataProvider = "getData")
	public void enterCredentials(String userName, String browser, String numId, int userId) {
		
		System.out.println(userName + " " + browser + " " + numId + " " + userId);

	}

	@Test(priority = 3, dataProviderClass = DataProviderClass.class, dataProvider = "getData")
	public void validateLoginPage(String userName, String browser, String numId, int userId) {
		
		System.out.println(userName + " " + browser + " " + numId + " " + userId);

	}

	@Test(priority = 4, dataProviderClass = DataProviderClass.class, dataProvider = "getData")
	public void logOut(String userName, String browser, String numId, int userId) {
		
		System.out.println(userName + " " + browser + " " + numId + " " + userId);

	}
	
	@Test(priority = 5, dataProviderClass = DataProviderClass.class, dataProvider = "sampleData")
	public void sample(String userName, String browser) {
		
		System.out.println(userName + " " + browser);
	}

}
