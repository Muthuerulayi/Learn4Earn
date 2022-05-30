package com.learn4earn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentAnnotationsExperiment {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public void launchRediff() {
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.className("signin")).click();
	}
	
	@Test(priority=1)
	public void signIn() throws Exception {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void logOut() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void rediffHome() throws Exception {
		driver.findElement(By.cssSelector("a.logo + span > a:nth-child(2) > b:nth-child(1)")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public static void closeWebDriver() {
		driver.close();
		//driver.quit();
	}
	
}

