package com.learn4earn.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {  // We can keep this DataProvider class inside different package also. Automatically imports the class when being called

	@DataProvider
	public static Object[][] getData(Method name) {
		
		System.out.println("Method name is: " + name.getName());
		
//		Object[][] data = new Object[3][4];
//		
//		data[0][0] = "User1";
//		data[0][1] = "Chrome";
//		data[0][2] = "ABCD123";
//		data[0][3] = 100;
//		
//		data[1][0] = "User2";
//		data[1][1] = "Firefox";
//		data[1][2] = "EFGH456";
//		data[1][3] = 200;
//		
//		data[2][0] = "User3";
//		data[2][1] = "Edge";
//		data[2][2] = "IJKL789";
//		data[2][3] = 300;
//		
//		return data;
		
		return new Object[][] {  // We can write the above commented code in the following way also
			
			{"User1","Chrome","ABCD123",100}, {"User2","Firefox","EFGH456",200}, {"User3","Edge","IJKL789",300}
		};
		
	}
	
	@DataProvider
	public static Object[][] sampleData(Method method) {
		
		System.out.println("Method name is: " + method.getName());
		
		return new Object[][] {
			
			{"User4","IE"}, {"User5","Brave"}
			
		};
	}
	
}
