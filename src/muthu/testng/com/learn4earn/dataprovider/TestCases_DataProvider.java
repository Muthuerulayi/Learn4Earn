package com.learn4earn.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCases_DataProvider {
	
	@Test(dataProvider = "getData")
	public void registeredUser(String userName, String browser, String numId, int userId) {
		
		System.out.println(userName + " " + browser + " " + numId + " " + userId);
		
	}
	
	@DataProvider
	public static Object[][] getData(Method name) {

		System.out.println("Method name is: " + name.getName());

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

}
