package com.learn4earn.interviewprep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RogersFullPrice {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rogers.com/");
		Thread.sleep(2000);
		
		// To get Rogers 'Home' page title and Url
		System.out.println("Rogers Home page title: " + driver.getTitle());
		System.out.println("Rogers Home page URL: "+ driver.getCurrentUrl());
		
		// Validate the title of the Rogers 'Home' page
		String rogersHomeExpectedTitle = "Wireless, Internet, TV, Home Monitoring, and Home phone | Rogers";
		String rogersHomeActualTitle = driver.getTitle();
		
		if(rogersHomeExpectedTitle.equals(rogersHomeActualTitle)) {
			System.out.println("Rogers Home page title is validated");
		}
		
		// Validate the Url of the Rogers 'Home' page
		String rogersHomeExpectedUrl = "https://www.rogers.com/";
		String rogersHomeActualUrl = driver.getCurrentUrl();
		
		if(rogersHomeExpectedUrl.equals(rogersHomeActualUrl)) {
			System.out.println("Rogers Home page URL is validated");
		}
		System.out.println();
		
		// Locate and validate the 'Shop' drop-down link
		WebElement shopLink = driver.findElement(By.xpath("//span[@class = 'm-navLink__caption' and text() = 'Shop']"));
		if(shopLink.isDisplayed() && shopLink.isEnabled()) {
			shopLink.click();
			System.out.println("Shop drop-down link is clicked");
		}
		Thread.sleep(2000);
		
		// Locate and validate the 'Wireless' link
		WebElement wirelessLink = driver.findElement(By.xpath("//li[@class='o-headerNavDropdown__item']/a[text() = ' Wireless ']"));
		if(wirelessLink.isEnabled()) {
			wirelessLink.click();
			System.out.println("Wireless link is clicked");
		}
		Thread.sleep(2000);
		
		// To get Rogers 'Wireless' page title and Url
		System.out.println("Rogers Wireless page title: " + driver.getTitle());
		System.out.println("Rogers Wireless page URL: "+ driver.getCurrentUrl());
		
		// Validate the title of the Rogers 'Wireless' page
		String rogersWirelessExpectedTitle = "Cell Phones, Mobile Plans, Tablets, Accessories and Mobility | Rogers";
		String rogersWirelessActualTitle = driver.getTitle();

		if(rogersWirelessExpectedTitle.equals(rogersWirelessActualTitle)) {
			System.out.println("Rogers Wireless page title is validated");
		}

		// Validate the Url of the Rogers 'Wireless' page
		String rogersWirelessExpectedUrl = "https://www.rogers.com/mobility";
		String rogersWirelessActualUrl = driver.getCurrentUrl();

		if(rogersWirelessExpectedUrl.equals(rogersWirelessActualUrl)) {
			System.out.println("Rogers Wireless page URL is validated");
		}
		System.out.println();
		
		// Locate and validate the 'View smartphones' button
		WebElement viewSmartPhonesButton = driver.findElement(By.xpath("//div[@class='ng-star-inserted']/descendant::span[text() = 'View smartphones ']"));
		if(viewSmartPhonesButton.isEnabled()) {
			viewSmartPhonesButton.click();
			System.out.println("View smartphones button is clicked");
		}
		Thread.sleep(3000);
		
		// To get Rogers 'Smart Phones' page title and Url
		System.out.println("Rogers Smart Phones page title: " + driver.getTitle());
		System.out.println("Rogers Smart Phones page URL: "+ driver.getCurrentUrl());

		// Validate the title of the Rogers 'Smart Phones' page
		String rogersSmartPhonesExpectedTitle = "Cell Phones and Devices - Buy iPhone, Samsung, Google Pixel | Rogers";
		String rogersSmartPhonesActualTitle = driver.getTitle();

		if(rogersSmartPhonesExpectedTitle.equals(rogersSmartPhonesActualTitle)) {
			System.out.println("Rogers Smart Phones page title is validated");
		}

		// Validate the Url of the Rogers 'Smart Phones' page
		String rogersSmartPhonesExpectedUrl = "https://www.rogers.com/phones/?icid=R_WIR_JOR_WBOM11";
		String rogersSmartPhonesActualUrl = driver.getCurrentUrl();

		if(rogersSmartPhonesExpectedUrl.equals(rogersSmartPhonesActualUrl)) {
			System.out.println("Rogers Smart Phones page URL is validated");
		}
		System.out.println();
		
		// Locate and validate the 'Full price' by providing the device name
		WebElement fullPrice = driver.findElement(By.xpath("//main[@id='mainContent']/descendant::p[text()='Samsung Galaxy S22 Ultra']/following::p[contains(text(),'Full price')]"));
		if(fullPrice.isDisplayed()) {
			System.out.println("The given device costs: " + fullPrice.getText());
		}

	}

}
