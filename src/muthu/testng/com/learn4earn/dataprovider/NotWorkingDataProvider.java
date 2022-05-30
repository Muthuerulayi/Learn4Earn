package com.learn4earn.dataprovider;

import org.testng.annotations.Test;

public class NotWorkingDataProvider {
	
	@Test(priority = 0)
	public static Object[][] getData() {
		
		//System.out.println("Method name is: " + name.getName());
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "User1";
		data[0][1] = "Chrome";
		data[0][2] = "ABCD123";
		data[0][3] = 100;
		
		data[1][0] = "User2";
		data[1][1] = "Firefox";
		data[1][2] = "EFGH456";
		data[1][3] = 200;
		
		data[2][0] = "User3";
		data[2][1] = "Edge";
		data[2][2] = "IJKL789";
		data[2][3] = 300;
		
		return data;
		
	}
	
	@Test(priority = 1)
	public void launchUrl() {
		System.out.println(getData());
		
		//System.out.println(userName + " " + browser + " " + numId + " " + userId);
		
	}

	@Test(priority = 2)
	public void enterCredentials() {
		System.out.println(getData().length);
		
		//System.out.println(userName + " " + browser + " " + numId + " " + userId);

	}

	@Test(priority = 3)
	public void validateLoginPage() {
		System.out.println(getData());
		
		//System.out.println(userName + " " + browser + " " + numId + " " + userId);

	}

	@Test(priority = 4)
	public void logOut() {
		System.out.println(getData());
		
		//System.out.println(userName + " " + browser + " " + numId + " " + userId);

	}


}
