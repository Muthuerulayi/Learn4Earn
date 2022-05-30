package com.learn4earn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoutErrorVerification {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		// Validating Home page title and url
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();

		if(expectedTitle.equals(actualTitle)) {
			System.out.println("My rediff Home page title is correct");
		}

		String expectedCurrentUrl = "https://www.rediff.com/";
		String actualCurrentUrl = driver.getCurrentUrl();

		if(expectedCurrentUrl.equals(actualCurrentUrl)) {
			System.out.println("My rediff Home page url is correct");
		}
		
		// Validating 'Sign in' link
		//WebElement signInLink = driver.findElement(By.xpath("//a[@class='signin']"));
		//WebElement signInLink = driver.findElement(By.xpath("//a[contains(@class, 'signin')]"));
		WebElement signInLink = driver.findElement(By.cssSelector("a.signin"));
		if(signInLink.isEnabled()) {
			signInLink.click();	
		}
		
		// Handling an alert/pop-up box
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		// After clicking on 'Sign in' link, check for the page title and the url of the landing page
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String expectedTitleNew = "Rediffmail";
		String actualTitleNew = driver.getTitle();

		if(expectedTitleNew.equals(actualTitleNew)) {
			System.out.println("My rediff Sign In page title is correct");
		}

		String expectedCurrentUrlNew = "https://mail.rediff.com/cgi-bin/login.cgi";
		String actualCurrentUrlNew = driver.getCurrentUrl();

		if(expectedCurrentUrlNew.equals(actualCurrentUrlNew)) {
			System.out.println("My rediff Sign In page url is correct");
		}

		// Validating 'Keep me signed in' check box
		WebElement keepMeSignedInAs = driver.findElement(By.cssSelector("input[id=remember]"));
		if(keepMeSignedInAs.isSelected()) {
			keepMeSignedInAs.click();
			Thread.sleep(2000);
			keepMeSignedInAs.click();
		}
		Thread.sleep(3000);

		// Validating 'Username' text box
		//WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
		if(usernameTextBox.isEnabled() && usernameTextBox.isDisplayed()) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		}

		// Validating 'Password' text box
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='password' and @name='passwd']"));
		if(passwordTextBox.isDisplayed() && passwordTextBox.isEnabled()) {
			passwordTextBox.sendKeys("Selenium@123");
		}

		// Validating 'Sign in' button
		WebElement signinButton = driver.findElement(By.xpath("//input[@name='proceed' and @class='signinbtn']"));
		if(signinButton.isDisplayed()) {
			signinButton.click();
		}

		// After clicking on 'Sign In' button, check for the page title and the url of the current landing page
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String expectedTitleMail = "Rediffmail";
		String actualTitleMail = driver.getTitle();

		if(expectedTitleMail.equals(actualTitleMail)) {
			System.out.println("My rediff Mail page title is correct");
		}

		String expectedCurrentUrlMail = "f5mail.rediff.com";
		String actualCurrentUrlMail = driver.getCurrentUrl();

		if(expectedCurrentUrlMail.equals(actualCurrentUrlMail)) {
			System.out.println("My rediff Mail page url is correct");
		} else { System.out.println("My rediff Mail page url is not correct"); }
		
		Thread.sleep(4000);

		// Validating 'Logout' link
		WebElement logOutLink = driver.findElement(By.cssSelector("a[class ^= rd_logout]"));
		if(logOutLink.isEnabled()) {
			logOutLink.click();
		}
		
		// After clicking on 'Logout' link, check for the page title and the url of the current landing page
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String expectedTitleLogOut = "Welcome to Rediffmail";
		String actualTitleLogOut = driver.getTitle();

		if(expectedTitleLogOut.equals(actualTitleLogOut)) {
			System.out.println("My rediff Log Out page title is correct");
		}

		String expectedCurrentUrlLogOut = "http://login.rediff.com/logout/logout.php?";
		String actualCurrentUrlLogOut = driver.getCurrentUrl();

		//if(expectedCurrentUrlLogOut.equals(actualCurrentUrlLogOut)) 
		if(actualCurrentUrlLogOut.contains(expectedCurrentUrlLogOut)) {
			System.out.println("My rediff Log out page url is correct");
		} else { System.out.println("My rediff Log out page url is not correct"); }

		Thread.sleep(3000);

		// Validating Logout confirmation message
		WebElement logOutConfirmationMessage = driver.findElement(By.xpath("//p[text() = 'You have successfully signed out of Rediffmail.']"));
		if(logOutConfirmationMessage.isDisplayed()) {
			System.out.println("Successful logout message");
		} else {
			System.out.println("No successful logout message");
		}

		// Validating 'Rediff Home' link
		//WebElement rediffHomeLink = driver.findElement(By.xpath("//b[text()='Rediff Home']"));
		WebElement rediffHomeLink = driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]"));
		if(rediffHomeLink.isEnabled() && rediffHomeLink.isDisplayed()) {
			rediffHomeLink.click();
		}

		Thread.sleep(2000);

		// Validating Home page logo
		WebElement logo = driver.findElement(By.xpath("//span[@class='hmsprite logo']"));
		if(logo.isDisplayed()) {
			System.out.println("Home page logo displayed");
		} else { System.out.println("Home page logo is not displayed"); }
	}
}

