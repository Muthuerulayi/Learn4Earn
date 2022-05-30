package com.learn4earn.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasesRediff {
	
	public static WebDriver driver;
	
	@Test(dataProviderClass = DataProviderRediff.class, dataProvider = "dp")
	public void launchWebsite(String url) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(dataProviderClass = DataProviderRediff.class, dataProvider = "dp")
	public void signIn(String userName, String password) throws Exception {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
	}
	
//	@Test
//	public void logOut() throws Exception {
//		driver.findElement(By.className("rd_logout")).click();
//		Thread.sleep(2000);
//	}
//	
//	@Test
//	public void rediffHome() throws Exception {
//		driver.findElement(By.cssSelector("a.logo + span > a:nth-child(2) > b:nth-child(1)")).click();
//		Thread.sleep(2000);
//	}
//	
	@Test(dataProviderClass = DataProviderRediff.class, dataProvider = "dp", dependsOnMethods = {"launchWebsite"})
	public static void closeWebDriver(String s) {
		driver.close();
		//driver.quit();
	}

}
