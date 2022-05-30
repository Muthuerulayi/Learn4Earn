package com.learn4earn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsTestNG {
	
	public static WebDriver driver;
	//@BeforeMethod and @AfterMethod

	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	}

	@Test(priority = 1)
	public void validateLandingPage() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Landing page is validated");

	}

	@Test(priority = 2)
	public void validateSignInLink() {
		WebElement signinLink = driver.findElement(By.className("signin"));
		
		Assert.assertTrue(signinLink.isDisplayed(), "Signin Link is displayed");

	}
	
	@Test(priority = 3)
	public void validateLoginPage() throws Exception {
		//validateSignInLink();
		//driver.findElement(By.className("signin")).click();	
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Rediffmail";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Login page is validated");
	
	}
	
	@AfterClass
	public void tierDown() {
		driver.close();
	}

}
