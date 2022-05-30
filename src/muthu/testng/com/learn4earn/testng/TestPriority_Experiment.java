package com.learn4earn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPriority_Experiment {
	public static WebDriver driver;
	//@BeforeMethod and @AfterMethod

	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	}

	@Test(priority = -1)
	public void validateLandingPage() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test Case with Priority -1 is PASS");
		} else {
			System.out.println("Test Case with Priority -1 is FAIL");
		}

	}

	@Test(priority = -2)
	public void validateSignInLink() {
		WebElement signinLink = driver.findElement(By.className("signin"));
		if(signinLink.isDisplayed() && signinLink.isEnabled()) {
			signinLink.click();
			System.out.println("Test Case with Priority -2 is PASS");
		}
		else {
			System.out.println("Test Case with Priority -2 is FAIL");
		}
	}
	
	@Test(priority = 0)
	public void validateLoginPage() throws Exception {
		//validateSignInLink();
		//driver.findElement(By.className("signin")).click();	
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Rediffmail";
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test Case with Priority 0 is PASS");
		} else {
			System.out.println("Test Case with Priority 0 is FAIL");
		}
	}
	
	@AfterClass
	public void tierDown() {
		driver.close();
	}
	
}