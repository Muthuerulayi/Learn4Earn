package com.learn4earn.waitconditions;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Concepts {
	
	public static WebDriver driver;
	public static WebDriverWait wait; // used for ExplicitWait

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.className("signinbtn")).click();
//		wait = new WebDriverWait(driver, 0); // it works for selenium-java 3.141.59 (before Selenium 4)
//		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // it works for selenium-java 4.1.3 (after Selenium 4)
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		System.out.println("Alert is handled");
//		
//		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.get("https://rediff.com");
//		wait = new WebDriverWait(driver, 0);
//		wait.until(ExpectedConditions.elementToBeClickable(By.className("signin"))).click();
		//WebElement signinLink = new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.className("signin")));
		//signinLink.click();
		
		new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.className("signin"))).click(); // in a single line
		new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.id("login1"))).sendKeys("seleniumpanda@rediffmail.com");
		new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Selenium@123");
		new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.className("signinbtn"))).click();
		new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.className("rd_logout"))).click();
		//Thread.sleep(10000);
		new WebDriverWait(driver, 0).until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(), 'Rediff Home')]"))).click();

	}

}
