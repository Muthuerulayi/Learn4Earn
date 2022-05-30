package com.learn4earn.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// We need to run testng.xml file (where we have given test case priority using method names) to execute all Tests of this class 
public class RediffValidationTestNGxml {
	
	public static WebDriver driver;
	
	@Test
	public static void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void launchRediff() {
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.className("signin")).click();
	}
	
	@Test
	public void signIn() throws Exception {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void logOut() throws Exception {
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void rediffHome() throws Exception {
		driver.findElement(By.cssSelector("a.logo + span > a:nth-child(2) > b:nth-child(1)")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public static void closeWebDriver() {
		driver.close();
		//driver.quit();
	}
	
}
