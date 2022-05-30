package com.learn4earn.classwoks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllAnnotations {
	
		
	//@BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test > @AfterMethod > @AfterClass > @AfterTest > @AfterSuite

	public static WebDriver driver;

	@BeforeSuite
	public void beforeSuite2() {
		System.out.println("This will be executed first-2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will be executed second");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will be executed first");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This will be executed third");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will be executed fourth");
	}

	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void linkClick() {
		driver.findElement(By.className("signin")).click();
	}
	
	@Test
	public void signIn() throws Exception {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void wlogOut() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will be executed sixth");
	}

	@AfterClass
	public void afterClass2() {
		System.out.println("This will be executed seventh-2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This will be executed eighth");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will be executed last");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This will be executed seventh");
	}

}
