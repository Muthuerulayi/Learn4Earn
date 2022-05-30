package com.learn4earn.waitconditions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_Concepts {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NONE); // slowest mode // In anyways all three modes increase the speed of automation
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); // fastest mode
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // Normal speed
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // it works for selenium-java 3.141.59 (before Selenium 4)
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // it works for selenium-java 4.1.3 (after Selenium 4)
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com");
		
		WebElement signInLink = driver.findElement(By.xpath("//a[@class='signin']"));
		signInLink.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='login1']"));
		userName.sendKeys("seleniumpanda@rediffmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Selenium@123");
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@class='signinbtn']"));
		signInButton.click();
		
		WebElement logOut = driver.findElement(By.xpath("//a[@class='rd_logout']"));
		logOut.click();
		
		WebElement rediffHome = driver.findElement(By.xpath("//b[text()='Rediff Home']"));
		rediffHome.click();

	}

}
